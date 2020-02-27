package com.learn2code.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn2code.Coach;

public class MyBeanScopeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		Coach coach1 = context.getBean("myCoach1", Coach.class);
		System.out.println(coach1.getDailyWorkout());
		System.out.println(coach1.getFortune());		
		
		Coach coach2 = context.getBean("myCoach1", Coach.class);
		System.out.println(coach2.getDailyWorkout());
		System.out.println(coach2.getFortune());
		
		boolean flag = (coach1 == coach2);
		System.out.println("Both objects equal: "+flag);
		System.out.println(coach1.toString()+" ## "+coach2.toString());
		context.close();
	}

}
