package com.todo.spring.login;

import com.todo.spring.service.auth.AuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("naam")
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
                            @RequestParam("password") String secret, ModelMap model
//                            RedirectAttributes redirectAttributes// we doesn't want
//                            the redirect scope for this variable(as it is till request only scope),
//                            we need session level scope.
    ) {
        boolean isAuthenticated = authService.authenticate(name, secret);
        if (isAuthenticated) {
//            redirectAttributes.addFlashAttribute("name", name.toUpperCase());
            model.put("naam", name);
            return "redirect:welcome";
        }
        model.put("errorMessage", "Invalid Credentials, Please try again!!");
        return "login";
    }
}
