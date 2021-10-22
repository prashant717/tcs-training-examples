package com.tcs.identifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestUINewApproach {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		ID id = (ID)context.getBean("i1");
		id.display();
		
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
