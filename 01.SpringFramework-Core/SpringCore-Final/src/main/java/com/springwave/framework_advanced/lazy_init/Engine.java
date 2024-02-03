package com.springwave.framework_advanced.lazy_init;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Engine {
     public Engine() {
         System.out.println("INIT: Engine");
     }
}
