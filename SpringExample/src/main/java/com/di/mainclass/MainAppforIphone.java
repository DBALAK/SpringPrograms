package com.di.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.di.example.IPhone;
import com.di.example.IPhoneConfig;

public class MainAppforIphone {

	public static void main(String[] args) {
		ApplicationContext fact = new AnnotationConfigApplicationContext(IPhoneConfig.class);
		IPhone ip = fact.getBean(IPhone.class);
		ip.config();
	}

}
