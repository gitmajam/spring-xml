package com.spring.xml;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today isn't your lucky day!";
	}

}
