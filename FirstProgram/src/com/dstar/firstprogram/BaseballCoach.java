package com.dstar.firstprogram;

public class BaseballCoach implements Coach {
	
	private Fortune fortune;
	
	public BaseballCoach(Fortune theFortune)
	{
		fortune=theFortune;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "Spend Whole Day";
	}
	
	public String getType()
	{
		return "Type";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}
}
