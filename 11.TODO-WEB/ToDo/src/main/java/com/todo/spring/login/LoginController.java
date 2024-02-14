package com.todo.spring.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginGet() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginPost(@RequestParam(name = "username") String name,
                            @RequestParam("password") String secret,
                            RedirectAttributes redirectAttributes) {
        if (name.equals("aditya") && secret.equals("pass")) {
            redirectAttributes.addFlashAttribute("name", name);
            return "redirect:welcome";
        }
        return "redirect:show-error";
    }

    @RequestMapping("show-error")
    @ResponseBody
    public String error() {
        return "Please enter the correct credentials";
    }


}
