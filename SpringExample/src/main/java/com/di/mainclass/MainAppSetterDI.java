package com.di.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.example.Tyre;


public class MainAppSetterDI {
	
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("setterdi.xml");
		Tyre t=(Tyre) ctxt.getBean("tyre");
		System.out.println(t);
	}

}
