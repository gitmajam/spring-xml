package com.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanScopeApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container (inversion of control)
		Coach theCoachA = context.getBean("myCoachA", Coach.class);
		Coach theCoachB = context.getBean("myCoachA", Coach.class);
		
		//verify if the same object in a singleton or prototype scope 
		System.out.println(theCoachA.hashCode());
		System.out.println(theCoachB.hashCode());
		
		//close the context
		context.close();

	}

}
