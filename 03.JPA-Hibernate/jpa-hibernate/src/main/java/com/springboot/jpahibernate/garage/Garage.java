package com.springboot.jpahibernate.garage;

public class Garage {

//    @Column("id")
     private int vehicleId;

//    @Column("name")
     private String vehicleName;
//    @Column("company")
    private String vehicleCompany;

//    public Garage(int id, String company, String name) {
//        this.vehicleId = id;
//        this.vehicleName = name;
//        this.vehicleCompany = company;
//    }

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

    public void setId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setCompany(String vehicleCompany) {
        this.vehicleCompany = vehicleCompany;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "Id=" + vehicleId +
                ", Company='" + vehicleCompany + '\'' +
                ", Name='" + vehicleName + '\'' +
                '}';
    }
}
