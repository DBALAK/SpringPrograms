package com.di.example;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class Snapdragon implements MobileProcessor {

	public void process() {
		System.out.println("Worlds 2nd best CPU");
	}

}
