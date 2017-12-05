package com.di.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.example.JavaCollection;


public class MainAppCollection {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanscollection.xml");
	      JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

	      jc.getAddressList();
	      jc.getAddressSet();
	      jc.getAddressMap();
	      jc.getAddressProp();
	
	}

}
