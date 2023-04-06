package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config file
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SwimSportConfig.class);
		
		//get the swim coach
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		System.out.println(swimCoach.getDailyWorkout());
		
		// get the fortune
		System.out.println(swimCoach.getDailyFortune());
		
		System.out.println(swimCoach.getEmail());
		
		System.out.println(swimCoach.getTeam());
		
		// call a method on the bean
		
		// close the context
		context.close();

	}

}
