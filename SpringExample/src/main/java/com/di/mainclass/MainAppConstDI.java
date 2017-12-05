package com.di.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.example.Tyre;
import com.di.example.TyreConstructor;


public class MainAppConstDI {
	
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("UsingConstructor.xml");
		TyreConstructor t=(TyreConstructor) ctxt.getBean("tyre");
		System.out.println(t);
		}

}
