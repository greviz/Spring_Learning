package com.learnspring.LearnApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldClass {

    @RequestMapping("/")
    public @ResponseBody
    String getHelloWorld(){
        return "Hello World";
    }
}
