package com.tcs.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDbNewApproach {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-beans.xml");
		Datasource datasource= (Datasource)context.getBean("ds");
		System.out.println("Username : "+datasource.getUsername());
		((ClassPathXmlApplicationContext)context).close();
	}
}
