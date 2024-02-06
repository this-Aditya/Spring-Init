package com.springboot.jpahibernate.garage;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Garage {

    @Id
     private int vehicleId;

    @Column(name = "name")
     private String vehicleName;
    @Column(name = "company")
    private String vehicleCompany;

    public Garage(int id, String company, String name) {
        System.out.println("Garage Constructor!!");
        this.vehicleId = id;
        this.vehicleName = name;
        this.vehicleCompany = company;
    }

    public Garage() {

    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public String getVehicleCompany() {
        return vehicleCompany;
    }

//    public void setVehicleId(int vehicleId) {
//        System.out.println("Setting vehicle Id!!");
//        this.vehicleId = vehicleId;
//    }
//
//    public void setVehicleName(String vehicleName) {
//        System.out.println("Setting Vehicle name");
//        this.vehicleName = vehicleName;
//    }
//
//    public void setVehicleCompany(String vehicleCompany) {
//        System.out.println("Setting Vehicle Company");
//        this.vehicleCompany = vehicleCompany;
//    }

    @Override
    public String toString() {
        return "Garage{" +
                "Id=" + vehicleId +
                ", Company='" + vehicleCompany + '\'' +
                ", Name='" + vehicleName + '\'' +
                '}';
    }
}
