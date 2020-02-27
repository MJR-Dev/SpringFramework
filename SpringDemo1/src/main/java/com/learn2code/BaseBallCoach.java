package com.learn2code;

public class BaseBallCoach implements Coach{
	private FortuneService fortuneService;
	public BaseBallCoach(FortuneService forserv) {
		fortuneService = forserv;
	}
	public String getDailyWorkout() {
		return "Do 3 laps of passing the Ball.";
	}
	public String getFortune() {
		return "Today Baseball day "+fortuneService.getFortune()+"!!";
	}
}
