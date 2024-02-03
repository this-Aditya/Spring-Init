package com.springwave.framework.dependency_injection.dependent_classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike {
    @Autowired
    Engine engine;
    Exhaust exhaust;
    HeadLight headLight;
    Seat seat;
    Tyre tyre;

    @Autowired
    public void setExhaust(Exhaust exhaust) {
        System.out.println("Setting exhaust");
        this.exhaust = exhaust;
        System.out.println("Checking the field `engine`: "+ engine );
    }

    public Bike(HeadLight headLight, Seat seat, Tyre tyre) {
        System.out.println("Performing contructor injection of headlight, seat and tyres");
        this.headLight = headLight;
        this.seat = seat;
        this.tyre = tyre;
    }
}
