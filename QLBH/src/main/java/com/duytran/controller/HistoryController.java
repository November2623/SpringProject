package com.duytran.controller;

import com.duytran.entity.History;
import com.duytran.entity.Provider;
import com.duytran.model.Product;
import com.duytran.model.ProviderDTO;
import com.duytran.repository.HistoryRepository;
import com.duytran.service.ProductService;
import com.duytran.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class HistoryController {
    @Autowired
    HistoryRepository historyRepository;

    @Autowired
    ProductService productService;

    @Autowired
    ProviderService providerService;

    @RequestMapping(value = {"/Admin"}, method = RequestMethod.GET)
    public String historyPage(HttpServletRequest rq){
        List<History> history = historyRepository.findAll();
        rq.setAttribute("history", history);
        return "History";
    }

    @RequestMapping(value = {"/History"}, method = RequestMethod.GET)
    public String historyPage2(HttpServletRequest rq){
        List<History> history = historyRepository.findAll();
        rq.setAttribute("history", history);
        return "History";
    }

    @RequestMapping(value = {"/History/GetMore"}, method = RequestMethod.GET)
    public String loadGetMoreHistory(HttpSession session, @RequestParam int id, String status, int productQR, int amount, int price_issue){
        Product product = productService.getProductByQR_code(productQR);
        ProviderDTO provider = providerService.getProviderById(product.getId_provider());
        Optional historydb = historyRepository.findById(id);
        if(historydb.isPresent()){
            History history2 = (History) historydb.get();
            session.setAttribute("history", history2);
        }
        else{
            //Handle Error
        }

        session.setAttribute("product", product);
        session.setAttribute("provider", provider);
        return "Form";

    }
}