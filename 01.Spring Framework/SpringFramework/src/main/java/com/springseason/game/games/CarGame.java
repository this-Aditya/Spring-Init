package com.springseason.game.games;

public class CarGame implements GamingConsole {

    public void up() {
        System.out.println("Accelerating");
    }

    public void down() {
        System.out.println("Brakes applied");
    }

    public void left() {
        System.out.println("Turned left");
    }

    public void right() {
        System.out.println("Turned Right");
    }

}
