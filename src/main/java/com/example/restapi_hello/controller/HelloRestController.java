package com.example.restapi_hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
@RequestMapping(value = {"","/","hello"})
    public String sayHello(){
        return "Hello from Bridgelabz !!";
    }
}
