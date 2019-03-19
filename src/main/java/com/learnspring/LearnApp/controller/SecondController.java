package com.learnspring.LearnApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class SecondController {

    @GetMapping("/secondSite")
    public String scnd(@RequestParam(name ="x", required=false, defaultValue="Oo") String name, Model model) {
        model.addAttribute("x", name);
        return "secondSite";
    }
}
