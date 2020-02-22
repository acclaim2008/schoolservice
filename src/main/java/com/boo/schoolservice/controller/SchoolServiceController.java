package com.boo.schoolservice.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolServiceController {

    @RequestMapping("/student")
    public String getStudent(@RequestParam String name){
        return "Hello" + name;
    }
}
