package com.duytran.controller;

import com.duytran.model.Customer;
import com.duytran.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = {"/","/login"})
    public String getAllCustomer(){
        return "login";

    }

    @RequestMapping( value = "/Customers", method= RequestMethod.GET)
    public String getAllCustomer(HttpServletRequest rs){
        List<Customer> customerList = customerService.getAllUsers();
        rs.setAttribute("customers", customerList);
        return "CustomersList";

    }
    @RequestMapping(value = "/Customers/Insert", method= RequestMethod.GET)
    public String loadFormInsert(HttpServletRequest rs){
//        rs.setAttribute("customer", new Customer());
        return "Form-Customers-Insert";
    }
    @RequestMapping(value = "/Customers/Insert", method = RequestMethod.POST)
    public String addCustomer(@ModelAttribute("customer") Customer customer){
        customerService.addCustomer(customer);
        return("redirect:/Customers");

    }
    @RequestMapping(value = "/Customers/Update", method= RequestMethod.GET)
    public String loadFormUpdate(HttpServletRequest rs, @RequestParam int id){
        rs.setAttribute("customer", customerService.getUserById(id));
        return "Form-Customers-Update";
    }
    @RequestMapping(value = "/Customers/Update", method = RequestMethod.POST)
    public String updateCustomer(@ModelAttribute("customer") Customer customer){
        customerService.updateCustomer(customer);
        return("redirect:/Customers");
    }
    @RequestMapping(value = "/Customers/Delete", method = RequestMethod.GET)
    public String deleteCustomer(@RequestParam int id){
        customerService.deleteCustomer(id);
        return("redirect:/Customers");
    }

}