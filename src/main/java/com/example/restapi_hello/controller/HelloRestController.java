package com.example.restapi_hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    @RequestMapping(value = {"", "/", "hello"})
    /**
     *localhost:8080/hello
     */
    public String sayHello() {
        return "Hello from Bridgelabz !!";
    }

    /**
     *localhost:8080/hello/query?name=Shubham
     */
    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name")String name){
        return "Hello" + name + "!!!" ;
    }

    

}
