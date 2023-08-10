package com.learnspring.calcservice;

import java.util.Arrays;

import org.springframework.stereotype.Component;


@Component
public class BusinessCalculatorService {
	
	private DataService dataService;
	
	public BusinessCalculatorService(DataService dataService) {
		//super();
		this.dataService = dataService;
	}
	
	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
	
	
}
