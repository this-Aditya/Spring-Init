package com.spring.restapi.controllers;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWorldI18n {
    MessageSource messageSource;

    public HelloWorldI18n(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @RequestMapping("hey")
    public String welcome() {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Subh Prabhat", locale);
    }
}
