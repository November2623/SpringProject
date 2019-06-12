package com.duytran.controller;


import com.duytran.entity.ProductJpa;
import com.duytran.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ProductJpaController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = "/ProductJpa")
    public String getAllProducts(HttpServletRequest rs){
        List<ProductJpa> productList = productRepository.findAll();
        rs.setAttribute("products", productList);
        return "ProductsList2";
    }

}

