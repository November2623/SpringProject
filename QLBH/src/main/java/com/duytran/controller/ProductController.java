package com.duytran.controller;

import com.duytran.entity.History;
import com.duytran.model.Customer;
import com.duytran.model.Product;
import com.duytran.model.ProviderDTO;
import com.duytran.repository.HistoryRepository;
import com.duytran.repository.ProductRepository;
import com.duytran.service.CustomerService;
import com.duytran.service.ProductService;
import com.duytran.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller


public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private ProviderService proviserService;

    @Autowired
    private HistoryRepository historyRepository;

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/Products")
    public String getAllProducts(HttpServletRequest rs){

        List<Product> productList = productService.getAllProducts();
        rs.setAttribute("products", productList);
        return "ProductsList";

    }
    // receipt: nhap kho
    @RequestMapping(value = "/UserPage/Receipt")
    public String loadFromReceipt(HttpServletRequest rq){
        Product product = new Product();
        List<ProviderDTO> providerList = proviserService.getAllProviders();
        rq.setAttribute("product", product);
        rq.setAttribute("providers", providerList);
        return "Form-Receipt";
    }
    @RequestMapping(value = "/Receipt", method = RequestMethod.POST)
    public String receiptGoods(@ModelAttribute("product") Product product){
        List<Product> productList = productService.getAllProducts();
        if(checkExists(productList,product)){
            int temp_id = productService.getProductByQR_code(product.getQR_code()).getId();
            productService.updateProduct(temp_id, product.getAmount());
        }
        else{
            productService.addProduct(product);

        }
        History history = new History("Receipt",product.getQR_code(),product.getAmount(),
                product.getAmount() * product.getPrice_receipt(), this.getDateTime(),product.getPrice_issue(),1);
        historyRepository.save(history);
        return "redirect:/UserPage";

    }
    // issue: xuat kho

    @RequestMapping(value = "/UserPage/Issue", method = RequestMethod.GET)
    public String loadFormIssue(HttpServletRequest rq){
        Product product = new Product();
        List<ProviderDTO> providerList = proviserService.getAllProviders();
        List<Customer> customers = customerService.getAllUsers();
        rq.setAttribute("customers",customers);
        rq.setAttribute("product", product);
        rq.setAttribute("providers", providerList);
        return "Form-Issue";
    }

    @RequestMapping(value = "/Issue", method = RequestMethod.POST)
    public String issueGoods(@ModelAttribute("product") Product product, HttpServletRequest req, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return("403");
        }
        List<Product> productList = productService.getAllProducts();
        String id = req.getParameter("id");
        int id_customer = Integer.parseInt(id);
        if(checkExists(productList, product)){
            int temp_id = productService.getProductByQR_code(product.getQR_code()).getId();
            Product product_temp  = productService.getProductById(temp_id);
            if(product_temp.getAmount() < product.getAmount()){
                return "redirect:/UserPage/Issue?error=true&message=0";
            }
            else if(product_temp.getPrice_receipt() > product.getPrice_issue()){
                return "redirect:/UserPage/Issue?error=true&message=1";
            }
            else{
                productService.updateProduct(temp_id, - product.getAmount());
                History history = new History("Issue",product.getQR_code(),product.getAmount(),
                        product.getAmount() * product.getPrice_issue(), this.getDateTime(), product.getPrice_issue(), id_customer);
                historyRepository.save(history);

                return "redirect:/UserPage";
            }

        }
        else
        {
            return "redirect:/UserPage/Issue?error=true&message=1";
        }

    }
    private boolean checkExists(List<Product> productList, Product product){
        for(Product p : productList){
            if((p.getProduct_name().equals(product.getProduct_name())) && (p.getQR_code()== product.getQR_code()))
                return true;
        }
        return false;
    }
    private LocalDateTime getDateTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return now;
    }
}
