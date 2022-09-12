package com.spring.xml;

public class MyApp {
	public static void main(String[] args) {
		
		//create the object (direct instantiation)
		Coach theCoachA = new BaseballCoach();
		Coach theCoachB = new TrackCoach();

		//use the object
		System.out.println(theCoachA.getDailyWorkout());
		System.out.println(theCoachB.getDailyWorkout());
	}
}
