package com.spring.restapi.versioning.entities;

public class PersonV2 {
    private Name naam;

    public PersonV2(Name name) {
        this.naam = name;
    }

    public Name getName() {
        return naam;
    }

    public void setName(Name name) {
        this.naam = name;
    }
}
