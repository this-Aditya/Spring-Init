package com.springwave.framework.game.games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Car Game")
public class CarGame implements GamingConsole {

    public void up() {
        System.out.println("CarGame: Accelerating");
    }

    public void down() {
        System.out.println("CarGame: Brakes applied");
    }

    public void left() {
        System.out.println("CarGame: Turned left");
    }

    public void right() {
        System.out.println("CarGame: Turned Right");
    }

}
