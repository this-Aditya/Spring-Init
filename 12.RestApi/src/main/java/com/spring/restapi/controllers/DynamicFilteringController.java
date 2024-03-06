package com.spring.restapi.controllers;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.spring.restapi.filtering.static_filter.SomeClass;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class DynamicFilteringController {

    @GetMapping("dynamic_filter")
    public MappingJacksonValue filterDynamic() {
        SomeClass someClass = new SomeClass("one", "two", "three");
        MappingJacksonValue jacksonValueMapping = new MappingJacksonValue(someClass);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeClassFilter", filter);
        jacksonValueMapping.setFilters(filters);
        return jacksonValueMapping;
    }

    @GetMapping("dynamic_filter_list")
    public MappingJacksonValue filterDynamicList() {
        List<SomeClass> classes = Arrays.asList(new SomeClass("one", "two", "three"),
                new SomeClass("four", "five", "six"));

        MappingJacksonValue jacksonValue = new MappingJacksonValue(classes);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeClassFilter", filter);
        jacksonValue.setFilters(filters);
        return jacksonValue;
    }
}
