package com.learnspring.gamerunner.game;

public class ContraGame implements GamingConsole {
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Duck");
	}
	public void left() {
		System.out.println("Go Back");
	}
	public void right() {
		System.out.println("Shoot");
	}
	
}
