package com.learning.springbootfirst.garage;

public class Bike implements Vehicle{
    String name;
    String company;

    public Bike(String company, String name) {
        this.company = company;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

//    @Override
//    public String toString() {
//        return "Bike(company= ( "+ company +" ),  name=  (" +name +")";
//    }
}
