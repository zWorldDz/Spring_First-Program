package com.dstar.firstprogram;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope {

	public static void main(String[] args) {
		
		//load configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanApplicationContext.xml");
		//retrieve bean
		Coach beanCoach = context.getBean("myCoach",Coach.class);
		Coach subBeanCoach = context.getBean("myCoach",Coach.class);
		
		boolean result=(beanCoach==subBeanCoach);
		System.out.println(result);
		System.out.println("ori location"+beanCoach);
		System.out.println("sub location"+subBeanCoach);
		
		context.close();
	}

}
