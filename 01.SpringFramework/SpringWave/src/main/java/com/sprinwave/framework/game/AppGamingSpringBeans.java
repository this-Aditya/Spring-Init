package com.sprinwave.framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpringBeans {
    public static void main(String[] args) {

        /* Not using this java way, instead updating it to the spring way!!
        var cargame = new Cargame();
        var personGame = new PersonWalkGame();
        var pacmanGame = new PacmanGame();
        var gameRunner = new GameRunner(pacmanGame);
        gameRunner.run(); */

        try (var context = new AnnotationConfigApplicationContext(GamingConfig.class)) {
//            var carGame = context.getBean(GamingConsole.class);
           /* By default getting car game as both the CarGame is default for gamingConsole and gameRunner Bean
            var gameRunner = context.getBean(GameRunner.class);
            gameRunner.run();
            */


        }
    }
}
