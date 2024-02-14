package com.todo.spring.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @ResponseBody
    @RequestMapping("say-hello")
    private String sayHello() {
        return "Hi, Welcome here!";
    }

    @ResponseBody
    @RequestMapping("say-hello-html")
    public String sayHelloHtml() {
        return "<html>" +
                "<head>" +
                "<title>Welcome:TODO</title>" +
                "</head>" +
                "<body>" +
                "Hello, Welcome to the page!!" +
                "</body>" +
                "</html>";
    }

//    @ResponseBody
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}
