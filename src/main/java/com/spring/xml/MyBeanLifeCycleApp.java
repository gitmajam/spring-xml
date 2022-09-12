package com.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanLifeCycleApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean from spring container (inversion of control)
		Coach theCoachA = context.getBean("myCoachA", Coach.class);
	
		System.out.println(theCoachA.getDailyFortune());
		
		//close the context
		context.close();

	}

}
