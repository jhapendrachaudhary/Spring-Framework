package com.JwtImplementation.jwt.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

   @GetMapping("/")
    public String greet(HttpServletRequest request){
        return "Never Give up" + request.getSession().getId();
        }
}
