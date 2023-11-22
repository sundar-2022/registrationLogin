package com.sundar.registrationLogin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class ParentController {

    @GetMapping("/")
    public String show(){
        return "home";
    }

    @GetMapping("/register")
    public String registrationPage(){
        return "registrationPage";
    }
}
