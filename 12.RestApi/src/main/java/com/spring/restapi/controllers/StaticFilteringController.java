package com.spring.restapi.controllers;

import com.spring.restapi.filtering.static_filter.SomeClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticFilteringController {

    @GetMapping("static_filter")
    public SomeClass doStaticFiltering() {
        return new SomeClass("one", "two", "three");
    }
}
