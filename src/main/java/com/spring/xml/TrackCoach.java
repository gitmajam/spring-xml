package com.spring.xml;

public class TrackCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	public TrackCoach() {
	}

	// dependency inyection with contructor
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it " + fortuneService.getFortune();
	}

}
