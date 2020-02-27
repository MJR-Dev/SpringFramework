package com.learn2code;

public class TrackCoach implements Coach{
	private FortuneService fortuneService;
	public TrackCoach(FortuneService forserv) {
		fortuneService = forserv;
	}
	
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
	
	public String getFortune() {
		return "Today Track day"+fortuneService.getFortune()+"!!";
	}
	public void startup() {
		System.out.println("init method called");
	}
	public void destroy() {
		System.out.println("destroy method called");
	}
}
