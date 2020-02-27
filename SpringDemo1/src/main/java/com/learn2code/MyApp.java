package com.learn2code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach1 = context.getBean("myCoach1", Coach.class);
		System.out.println(coach1.getDailyWorkout());
		System.out.println(coach1.getFortune());
		
		Coach coach2 = (Coach)context.getBean("myCoach2");
		System.out.println(coach2.getDailyWorkout());
		System.out.println(coach2.getFortune());
		
		CricketCoach coach3 = (CricketCoach)context.getBean("myCoach3");
		System.out.println(coach3.getDailyWorkout());
		System.out.println(coach3.getFortune());
		System.out.println(coach3.getEmailTeam());
		
		Coach coach4 = (Coach)context.getBean("myCoach4");
		System.out.println(coach4.getDailyWorkout());
		System.out.println(coach4.getFortune());
		context.close();
	}

}
