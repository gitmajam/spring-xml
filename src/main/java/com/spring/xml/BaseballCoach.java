package com.spring.xml;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	public BaseballCoach() {
		System.out.println("inside no-arg constructor");
	}

	// dependency inyection with contructor
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("inside doMyStartupStuff");
	}
	//add a destry method
	public void doMycleanStuff() {
		System.out.println("inside doMycleanStuff");
	}

}
