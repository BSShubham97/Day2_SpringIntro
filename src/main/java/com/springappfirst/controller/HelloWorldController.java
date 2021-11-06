package com.springappfirst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    @GetMapping("/web")
    public String hello() {
        return "HELLO FROM BRIDGELABZ";
    }
}
