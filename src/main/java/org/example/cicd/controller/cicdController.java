package org.example.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cicdController {
    @GetMapping("/demo")
    public String demo(){
        return "demo";
    }
}
