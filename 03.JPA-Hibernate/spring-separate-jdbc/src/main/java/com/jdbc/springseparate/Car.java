package com.jdbc.springseparate;

public class Car {

    public Car(int a) {

    }
    private int carId;
    private String carName;
    private String carCompany;

    public int getCarId() {
        return carId;
    }

    public void setId(int carId) {
        System.out.println("Setting Car Id");
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setName(String carName) {
        System.out.println("Setting Car name");
        this.carName = carName;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCompany(String carCompany) {
        System.out.println("Setting Car Company");
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
