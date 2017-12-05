package com.di.example;

import org.springframework.stereotype.Component;

@Component

public class MediaTek implements MobileProcessor {

	public void process() {
		System.out.println("World 2nd best processor");
	}

}
