package com.springboot.jpahibernate.garage;

public class GarageToInsert {

    int id;
    String name;
    String company;

    public GarageToInsert(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }
}
