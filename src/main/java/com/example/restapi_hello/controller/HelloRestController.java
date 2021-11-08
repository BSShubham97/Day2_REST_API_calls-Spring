package com.example.restapi_hello.controller;
import com.example.restapi_hello.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    @RequestMapping(value = {"", "/", "hello"})
    /** UC-1
     *localhost:8080/hello
     */
    public String sayHello() {
        return "Hello from Bridgelabz !!";
    }

    /**
     * UC-2
     * localhost:8080/hello/query?name=Shubham
     */
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello" + name + "!!!";
    }

    /**
     * UC-3
     * localhost:8080/hello/param/Shubham
     *
     * @param name
     * @return Hello name
     */
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello" + name + "!!!";
    }

    /** UC-4
     * {"firstName":"Mark","lastName":"Taylor"} in body in POSTMAN
     * http://localhost:8080/hello/post
     */
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello" + user.getFirstName() + " " + user.getLastName() + "!!!!";
    }
}