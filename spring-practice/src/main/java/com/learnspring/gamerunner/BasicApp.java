package com.learnspring.gamerunner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspring.gamerunner.game.ContraGame;
import com.learnspring.gamerunner.game.GameRunner;
import com.learnspring.gamerunner.game.MarioGame;

public class BasicApp {

	public static void main(String[] args) {
		MarioGame marioGame = new MarioGame();
		var contraGame = new ContraGame();
		var gameRunner = new GameRunner(marioGame);
		
		gameRunner.run();
		

	}
}
