package com.dstar.firstprogram;

public class TrackCoach implements Coach {
	private Fortune fortune;
	
	public TrackCoach(Fortune theFortune)
	{
		fortune=theFortune;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run awhile";
	}
	public String getType()
	{
		return "Type2";
	}
	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}
	
	//add method
	public void startUp()
	{
		System.out.println("TrackCoach: Starting up ");
	}
	public void cleanUp()
	{
		System.out.println("TrackCoach: ending ");
	}
	
}
