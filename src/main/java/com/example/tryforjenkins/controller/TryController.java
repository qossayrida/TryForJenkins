package com.example.tryforjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TryController {
    @GetMapping("/")
    public String getHome() {
        return "Home page accessed successfully";
    }
}