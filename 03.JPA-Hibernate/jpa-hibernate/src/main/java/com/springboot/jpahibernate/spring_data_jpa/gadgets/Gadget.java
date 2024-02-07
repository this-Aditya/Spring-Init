package com.springboot.jpahibernate.spring_data_jpa.gadgets;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Gadget {

    @Id
    private long id;
    private String name;
    private String company;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Setting Id");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting name!!");
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        System.out.println("Setting company!!");
        this.company = company;
    }

    @Override
    public String toString() {
        return "Gadget{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
