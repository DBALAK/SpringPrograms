package com.di.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.example.Vehicle;


public class MainAppAnnon {
	
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("annobasedconfig.xml");
		Vehicle obj=(Vehicle)ctxt.getBean("car");
		obj.drive();
		
	}

}
