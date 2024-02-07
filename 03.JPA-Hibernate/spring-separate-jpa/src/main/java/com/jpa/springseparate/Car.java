package com.jpa.springseparate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {

    @Id
    private int carId;

    @Column(name = "name")
    private String carName;

    @Column(name = "company")
    private String carCompany;

    public int getCarId() {
        return carId;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarId(int carId) {
        System.out.println("Setting car id");
        this.carId = carId;
    }

    public void setCarName(String carName) {
        System.out.println("Setting car name");
        this.carName = carName;
    }

    public void setCarCompany(String carCompany) {
        System.out.println("Setting car company");
        this.carCompany = carCompany;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                ", carCompany='" + carCompany + '\'' +
                '}';
    }
}
