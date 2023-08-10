package com.learnspring.calcservice;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessCalculatorApplication {
	
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(BusinessCalculatorApplication.class)) {
			// print all beans
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out :: println);
			System.out.println(context.getBean(BusinessCalculatorService.class).findMax());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
