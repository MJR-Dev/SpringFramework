package com.learn2code;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	private String[] data = {"Hello this is a sample","showcasing the concept of DI","using random array to be returned."};
	private Random random = new Random();
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = random.nextInt(data.length);
		return data[index];
		
	}	

}
