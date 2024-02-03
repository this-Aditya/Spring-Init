package com.springwave.framework.game;

import com.springwave.framework.game.games.GameRunner;
import com.springwave.framework.game.games.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springwave.framework.game.games")
public class GamingAppSpringLauncher {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingAppSpringLauncher.class)) {
            var pacmanGame = context.getBean(GamingConsole.class);
            var gameRunner = context.getBean(GameRunner.class);
            pacmanGame.right();
            gameRunner.run();
        }
    }

    /* Skipping bean creation for now!!
    @Bean("Car Game")
    @Primary
    GamingConsole carGame() {
        return new CarGame();
    }

    @Bean("Pacman Game")
    @Qualifier("Pacman")
    GamingConsole pacmanGame() {
        return new PacmanGame();
    }

    @Bean
    GamingConsole personWalkGame() {
        return new PersonWalkGame();
    }

    @Bean
    @Primary
    GameRunner carGameRunner(GamingConsole gamingConsole) {
        return new GameRunner(gamingConsole);
    }

    @Bean("Pacman GR")
    GameRunner pacmanGameRunner(@Qualifier("Pacman") GamingConsole pacmangc) {
        return new GameRunner(pacmangc);
    }

    @Bean
    GameRunner personWalkGameRunner(GamingConsole personWalkGame) {
        return new GameRunner(personWalkGame);
    }
*/
}
