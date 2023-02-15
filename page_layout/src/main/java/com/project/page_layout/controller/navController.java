package com.project.page_layout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class navController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/home")
    public String getHome() {
        return "index";
    }

    @GetMapping("/data")
    public String getData() {
        return "menu/data";
    }

    @GetMapping("/input")
    public String getInput() {
        return "menu/input";
    }
}
