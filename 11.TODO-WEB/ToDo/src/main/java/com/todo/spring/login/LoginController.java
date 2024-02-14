package com.todo.spring.login;

import com.todo.spring.login.auth.AuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
    AuthenticationService authService;

    public LoginController(AuthenticationService authService) {
        this.authService = authService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginGet() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginPost(@RequestParam(name = "username") String name,
                            @RequestParam("password") String secret,
                            RedirectAttributes redirectAttributes, ModelMap model) {
        boolean isAuthenticated = authService.authenticate(name, secret);
        if (isAuthenticated) {
            redirectAttributes.addFlashAttribute("name", name);
            return "redirect:welcome";
        }
        model.put("errorMessage", "Invalid Credentials! Please try again!!");
        return "login";
    }
}
