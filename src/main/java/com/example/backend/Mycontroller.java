package com.example.backend;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class Mycontroller {


    @RequestMapping("/health")
    public String healthCheck() {
        return "OK";
    }
}