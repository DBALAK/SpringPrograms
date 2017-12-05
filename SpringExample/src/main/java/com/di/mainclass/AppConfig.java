package com.di.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.di.example.ApplicationConfig;
import com.di.example.Samsung;

public class AppConfig {
	public static void main(String[] args) {
		ApplicationContext ctxt=new AnnotationConfigApplicationContext(ApplicationConfig.class);
	    Samsung samsung= ctxt.getBean(Samsung.class);
	    samsung.config();
	}
}
