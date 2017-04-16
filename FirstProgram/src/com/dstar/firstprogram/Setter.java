package com.dstar.firstprogram;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Setter {

	public static void main(String[] args) {

		//Load Spring Configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve Bean
		CricketCoach coach = context.getBean("CricketCoach",CricketCoach.class);
		//Call method
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getTeam());
		System.out.println(coach.getEmail());
		//Close
		context.close();
	}

}
