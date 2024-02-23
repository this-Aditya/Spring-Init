package com.spring.restapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LandingPageController {

    @GetMapping
    public String land() {
        return "redirect:users";
    }
}
