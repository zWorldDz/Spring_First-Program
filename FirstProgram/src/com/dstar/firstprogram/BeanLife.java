package com.dstar.firstprogram;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLife {

	public static void main(String[] args) {
		//load configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");
		//retrieve bean
		Coach beanCoach = context.getBean("myCoach",Coach.class);

		System.out.println(beanCoach.getDailyWorkout());
		
		context.close();
	}

}
