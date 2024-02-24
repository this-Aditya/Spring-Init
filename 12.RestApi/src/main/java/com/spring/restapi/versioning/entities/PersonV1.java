package com.spring.restapi.versioning.entities;

public class PersonV1 {
    String naam;

    public PersonV1(String name) {
        this.naam = name;
    }

    public String getName() {
        return naam;
    }

    public void setName(String name) {
        this.naam = name;
    }
}
