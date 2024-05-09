package com.mockito.unittesting.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

   @GetMapping("/add")
    public String addUser(){
        return "user added";
    }
}
