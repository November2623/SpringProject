package com.duytran.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping(value = "/403")
    public String loadErrorPage(){
        return "403";
    }
}