package com.duytran.controller;

import com.duytran.entity.Provider;
import com.duytran.model.Product;
import com.duytran.model.ProviderDTO;
import com.duytran.service.ProductService;
import com.duytran.service.ProviserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private ProviserService proviserService;

    @RequestMapping(value = "/Products")
    public String getAllProducts(HttpServletRequest rs){
        List<Product> productList = productService.getAllProducts();
        rs.setAttribute("products", productList);
        return "ProductsList";

    }
    // receipt: nhap kho
    @RequestMapping(value = "/Receipt")
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
            productService.updateProduct(product.getId(), product.getId_unit());
        }
        else{
            productService.addProduct(product);
        }
        return "redirect:/Products";

    }
    public boolean checkExists(List<Product> productList, Product product){
        for(Product p : productList){
            if(p.getId() == product.getId())
                return true;
        }
        return false;
    }
}
