package com.todo.spring.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandingPageController {

    @RequestMapping
    public String homePage() {
        return "redirect:login";
    }
}
