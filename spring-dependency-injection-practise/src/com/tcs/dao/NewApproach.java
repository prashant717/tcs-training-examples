package com.tcs.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NewApproach {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-beans.xml");
		MyDao dao= (MyDao)context.getBean("dao");
          dao.connect();
         (( ClassPathXmlApplicationContext)context).close();
	}

}
