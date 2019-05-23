package com.duytran.controller;

import com.duytran.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import com.duytran.model.User;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/ListUser", method = RequestMethod.GET)
    public String getAllUser(HttpServletRequest rs){
        List<User> users = userService.getAllUsers();
        rs.setAttribute("users", users);
        return "ListFile";
    }
    @RequestMapping(value="/addUser", method = RequestMethod.GET)
    public String home(HttpServletRequest rs){
        rs.setAttribute("user", new User());
        return "Form";
    }
    @RequestMapping(value="/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user){
        userService.addUser(user);
        return("redirect:/ListUser");
    }
}