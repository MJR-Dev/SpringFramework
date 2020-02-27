package com.learn2code;

public class HockeyCoach implements Coach {
	private FortuneService randomForserv;
	public HockeyCoach(FortuneService forserv) {
		randomForserv = forserv;
	}
	public String getDailyWorkout() {
		return "Hit 200 goals at 200kmph strike rate";
	}
	public String getFortune() {
		return "Today Goal day "+randomForserv.getFortune()+"!!";
	}
}
