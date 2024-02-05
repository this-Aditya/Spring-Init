package com.learning.springbootfirst.currency_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServiceController {

    @Autowired
    CurrencyServiceConfig config;


    @RequestMapping("/currency-service")
    public CurrencyServiceConfig getCurrencyService() {
        return config;
    }
}
