package com.springbootdev.examples.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class WelcomeController
{

    @GetMapping("/welcome")
    public String sayHello(){
        return "Welcome to www.SpringBootDev.com";
    }
}
