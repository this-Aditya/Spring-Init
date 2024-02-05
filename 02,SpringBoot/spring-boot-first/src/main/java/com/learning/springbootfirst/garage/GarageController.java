package com.learning.springbootfirst.garage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GarageController {

    @RequestMapping("/cars")
    public List<Car> getCars() {
        return List.of(
                new Car("Mercedes", "Maybach"),
                new Car("Range Rover", "Velar")
        );
    }

    @RequestMapping("")
    public String landingPage() {
        return "Hey there, Welcome to the Aditya's Spring Application";
    }

    @RequestMapping("garage")
    public List<Vehicle> lookupGarage() {
        return List.of(
                new Car("Mercedes", "Maybach"),
                new Car("Range Rover", "Velar"),
                new Bike("Royal Enfield", "Classic 350, Chrome Bronze")
        );
    }


}
