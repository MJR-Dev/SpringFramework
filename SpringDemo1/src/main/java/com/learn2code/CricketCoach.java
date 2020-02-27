package com.learn2code;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String email,team;
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public void setFortuneService(FortuneService forserv) {
		this.fortuneService = forserv;
	}
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today Cricket day "+fortuneService.getFortune()+" !!";
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do 100 shots of batting with left leg forward";
	}

	public String getEmailTeam() {
		return "Email: "+email+"  Team Name: "+team;
	}
}
