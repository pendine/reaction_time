package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class simplecontroller {

    @GetMapping("/")
    public String startTest() {
        return "startTest";
    }



}
