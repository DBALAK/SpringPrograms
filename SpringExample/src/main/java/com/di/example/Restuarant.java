package com.di.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restuarant implements InitializingBean,DisposableBean {

	String welcomeNote;

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void message(){
		System.out.println(welcomeNote);
	}

	public void destroy() throws Exception {
		System.out.println("Before destroy");		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("After bean creation");
		
	}
	
	/*@PostConstruct  
	public void init() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("AFter bean creation");
		
	}

	@PreDestroy
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Before destroy");
		
	}
*/	
}
