package com.learnspring.gamerunner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnspring.gamerunner.game.GameRunner;
import com.learnspring.gamerunner.game.GamingConsole;
import com.learnspring.gamerunner.game.MarioGame;

@Configuration
public class GameRunnerConfiguration {
	
	@Bean
	public GamingConsole game() {
		return new MarioGame();
	}
	
	@Bean
	public GameRunner gameRunner() {
		return new GameRunner(game());
	}
}
