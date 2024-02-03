package com.springwave.framework.game.games;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacmanGame implements GamingConsole{

    public void up() {
        System.out.println("Pacman: Accelerated");
    }

    public void down() {
        System.out.println("Pacman: Brakes applied");
    }

    public void left() {
        System.out.println("Pacman: Turned left");
    }

    public void right() {
        System.out.println("Pacman: Turned Right");
    }


}
