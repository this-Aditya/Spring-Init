package com.springwave.framework.game.games;

import org.springframework.stereotype.Component;

@Component
public class PersonWalkGame implements GamingConsole{

    public void up() {
        System.out.println("PersonWalk: Accelerate");
    }

    public void down() {
        System.out.println("PersonWalk: Brakes applied");
    }

    public void left() {
        System.out.println("PersonWalk: Turned left");
    }

    public void right() {
        System.out.println("PersonWalk: Turned Right");
    }


}
