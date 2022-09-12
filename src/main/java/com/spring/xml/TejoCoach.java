package com.spring.xml;

public class TejoCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new fields which are going to be inyected
	private String emailAddress;
	private String team;

	public TejoCoach() {
		System.out.println("inside no-arg constructor");
	}
	
	// dependency inyection with contructor
	public TejoCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	// dependency inyection with setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside setter method");
		this.fortuneService = fortuneService;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("inside setter method  emailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("inside setter method  team");
		this.team = team;
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
