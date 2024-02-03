package com.springwave.framework_advanced.lazy_init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/* Won't initialize the beans until the

@Configuration
@Lazy
public class LazyConfig {

    @Bean
    public Engine getEngine() {
        return  new Engine();
    }

    @Bean
    public Seat getSeat() {
        return new Seat();
    }

    @Bean
    public Tyres getTyres() {
        return new Tyres();
    }

    @Bean
    public Car getCar(Engine engine, Tyres tyres, Seat seat) {
        return new Car(engine, seat, tyres);
    }
}
*/




