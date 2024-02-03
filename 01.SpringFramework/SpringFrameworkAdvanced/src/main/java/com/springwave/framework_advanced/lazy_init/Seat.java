package com.springwave.framework_advanced.lazy_init;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Seat {

    public Seat() {
        System.out.println("INIT: Seat");
    }
}
