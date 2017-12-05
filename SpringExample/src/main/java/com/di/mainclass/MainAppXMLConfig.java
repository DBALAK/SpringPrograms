package com.di.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.example.Vehicle;


public class MainAppXMLConfig {
	
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("xmlbaseddi.xml");
		Vehicle obj=(Vehicle)ctxt.getBean("car");
		obj.drive();
		Vehicle obj1=(Vehicle)ctxt.getBean("bike");
		obj1.drive();
		}

}
