package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call a method from daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//the end
		
		// get the cricket coach from spring container
		Coach criCoach = context.getBean("cricketCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(criCoach.getDailyWorkout());
		
		// call service of setter injection
		System.out.println(criCoach.getDailyFortune());
		
		//the end
		
		
		//
		
		// close the context
		context.close();

	}

}
