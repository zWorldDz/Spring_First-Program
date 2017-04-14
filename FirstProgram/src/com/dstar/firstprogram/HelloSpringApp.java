package com.dstar.firstprogram;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		
		//call methods
		System.out.print(theCoach.getDailyWorkout());
		//close
		context.close();
	}

}
