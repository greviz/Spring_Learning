package com.learnspring.LearnApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldClass {

    @RequestMapping("/")
    public String index(){
        return "Hello World";
    }
}
