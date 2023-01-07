package com.aishu.ucmfinalproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getStatus()
    {
        return "App is currently Running...";
    }

    @GetMapping("/home")
    public String getHome()
    {
        return "YOu are currently at the home page";
    }
}
