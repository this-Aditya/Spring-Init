package com.springwave.framework_advanced.lazy_init;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Car {
    Engine engine;
    Seat seat;
    Tyres tyres;

    public Car(Engine engine, Seat seat, Tyres tyres) {
        System.out.println("INIT: Cars");
        this.engine = engine;
        this.seat = seat;
        this.tyres = tyres;
    }
}
