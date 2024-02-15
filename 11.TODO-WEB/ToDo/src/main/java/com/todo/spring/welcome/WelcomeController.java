package com.todo.spring.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("naam")
public class WelcomeController {

    /*
    This won't work if request is refreshed, it would not be coming from redirection after the refresh!
    It is only comping from redirection just after login is succeed, after refreshing. 'name' will noy
    be available...
    @RequestMapping("welcome")
    public String welcomePage(@ModelAttribute("name") String name, ModelMap model) {
        model.put("naam", name);
        return "welcome";
    }
     */

    @RequestMapping("welcome")
    public String welcome() {
        return "welcome";
    }
}
