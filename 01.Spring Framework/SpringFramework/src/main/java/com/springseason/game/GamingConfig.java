package com.springseason.game;

import com.springseason.game.games.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfig {

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
}
