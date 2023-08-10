package com.learnspring.gamerunner;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learnspring.gamerunner.game.GameRunner;

@Configuration
@ComponentScan("com.learnspring.gamerunner.game")
public class SpringApp {
	public static void main(String[] args) {
		try (// 1. Create Spring Context
				// 2. Pass Configuration class into the context creation
		var context = new AnnotationConfigApplicationContext(SpringApp.class)) {
//			System.out.println(context.getBean("mario"));
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
