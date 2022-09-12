package com.spring.xml;

public class RandomFortuneService implements FortuneService {
	
	String[] fortuneMessages = {"GoodLuck Today!", "No more Excuses!", "Remember where are you from!", "Please take a rest!" };

	@Override
	public String getFortune() {
		int index = (int)Math.floor(Math.random()*(4)); 
		return fortuneMessages[index];
	}

}
