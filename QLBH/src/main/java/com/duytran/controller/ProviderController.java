package com.duytran.controller;

import com.duytran.entity.Provider;
import com.duytran.model.Product;
import com.duytran.repository.ProviderRepository;
import com.duytran.model.ProviderDTO;
import com.duytran.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import com.duytran.service.ProviderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ProviderController {

    @Autowired
    private ProviderService proviserService;

    @Autowired
    private ProductService productService;

    @Autowired
    private ProviderRepository providerRepository;


    @RequestMapping(value = "/Providers")
    public String getAllProvider(HttpServletRequest rq){
        List<ProviderDTO> listProviders = proviserService.getAllProviders();
        rq.setAttribute("providers", listProviders);
        return "ProvidersList";
    }
    @RequestMapping(value = "/UserPage/Insert")
    public String loadFromInsert(HttpServletRequest rq){
        ProviderDTO providerDTO = new ProviderDTO();
        rq.setAttribute("provider", providerDTO);
        return "Form-Provider-Insert";
    }
    @RequestMapping(value = "/Providers/Insert", method = RequestMethod.POST)
    public String addProvider(@ModelAttribute("provider") ProviderDTO provider){
        proviserService.addProvider(provider);
        return "redirect:/Providers";
    }
    @RequestMapping(value = "/Providers/Update")
    public String loadFromUpdate(HttpServletRequest rq, @RequestParam int id){
        rq.setAttribute("provider", proviserService.getProviderById(id));
        return "Form-Provider-Update";

    }
    @RequestMapping(value = "/Providers/Update", method = RequestMethod.POST)
    public String updateProvider(@ModelAttribute("provider") ProviderDTO provider){
        proviserService.updateProvider(provider);
        return "redirect:/Providers";
    }
    @RequestMapping(value = "/Providers/Delete")
    public String deleteProvider(@RequestParam int id){
//        ProviderDTO provider = proviserService.getProviderById(id);
//        List<Product> productList = productService.getProductByProvider(id);
//        for(Product product : productList){
//            this.productService.deleteProduct(product.getId());
//        }
        Optional<Provider> provider = providerRepository.findById(id);
        if(provider.isPresent()){
            Provider provider1 = provider.get();
            this.providerRepository.delete(provider1);
        }

        return "redirect:/Providers";
    }
}