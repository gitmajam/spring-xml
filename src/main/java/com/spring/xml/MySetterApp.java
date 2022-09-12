package com.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySetterApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container (inversion of control)
		TejoCoach theCoachA = context.getBean("myCoachC", TejoCoach.class);
		
		//call method on the bean
		System.out.println(theCoachA.getDailyWorkout());

		//functionality by FortuneService setter inyection
		System.out.println(theCoachA.getDailyFortune());
		
		//inyected literals
		System.out.println(theCoachA.getEmailAddress());
		System.out.println(theCoachA.getTeam());
		
		//close the context
		context.close();

	}

}
