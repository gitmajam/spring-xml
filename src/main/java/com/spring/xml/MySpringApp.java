package com.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container (inversion of control)
		Coach theCoachA = context.getBean("myCoachA", Coach.class);
		Coach theCoachB = context.getBean("myCoachB", Coach.class);
		
		//call methos on the bean
		System.out.println(theCoachA.getDailyWorkout());
		System.out.println(theCoachB.getDailyWorkout());
		
		//functionality by FortuneService constructor inyection
		System.out.println(theCoachA.getDailyFortune());
		System.out.println(theCoachB.getDailyFortune());
		
		//close the context
		context.close();

	}

}
