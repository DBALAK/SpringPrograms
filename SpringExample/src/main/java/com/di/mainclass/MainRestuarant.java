package com.di.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.example.Restuarant;

public class MainRestuarant {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beanlifecycle.xml");
		((AbstractApplicationContext)ctxt).registerShutdownHook(); //destroy all beans
		Restuarant res=(Restuarant)ctxt.getBean("rest");
		res.setWelcomeNote("Hi,Welcome to Spring");
		res.message();
		
		//Restuarant res2=(Restuarant)ctxt.getBean("rest"); Verification for singleton
		//res.message();  //Hi,Welcome Spring (2 times printed)
		
		//Restuarant res2=(Restuarant)ctxt.getBean("rest"); Verification for prototype
		//res.message();  //Hi,Welcome Spring and null (as scope is prototype)
	}
	
	

}
