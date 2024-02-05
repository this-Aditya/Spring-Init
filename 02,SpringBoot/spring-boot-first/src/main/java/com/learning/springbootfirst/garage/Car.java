package com.learning.springbootfirst.garage;

public class Car implements Vehicle{
    String company;
    String name;

    public Car(String company, String name) {
        this.company = company;
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "Car(company= ( "+ company +" ),  name=  (" +name +")";
//    }
}
