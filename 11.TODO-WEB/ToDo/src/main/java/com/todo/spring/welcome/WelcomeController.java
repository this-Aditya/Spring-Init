package com.todo.spring.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("welcome")
    public String welcomePage(@ModelAttribute("name") String name, ModelMap model) {
        model.put("naam", name);
        return "welcome";
    }
}
