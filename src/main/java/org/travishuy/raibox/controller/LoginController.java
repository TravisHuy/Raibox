package org.travishuy.raibox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    @GetMapping("/")
    public String great(){
        return "Welcome to Telusko, google.com";
    }
}
