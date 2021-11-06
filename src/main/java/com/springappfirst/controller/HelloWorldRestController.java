package com.springappfirst.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldRestController {
    @RequestMapping("/")
    public String index(){
        return "HELLO FROM BRIDGELABZ - REST CALL";
    }



}
