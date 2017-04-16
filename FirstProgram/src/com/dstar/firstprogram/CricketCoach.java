package com.dstar.firstprogram;

public class CricketCoach implements Coach {

	private Fortune fortune;
	
	//add new fields for email and team
	private String email;
	private String team;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "testing";
	}

	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "testing1";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "testing2";
	}

}
