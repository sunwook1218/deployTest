package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/rest")
    public String rest() {
        return "redirect:/hello";
    }

    @RequestMapping("/control")
    public String control() {
        return "control";
    }
}
