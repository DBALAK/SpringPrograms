package com.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoForEach {
	
	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(1,2,3,4);
		lst.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		});
		
		Consumer<Integer> c=i -> System.out.println(i);
		lst.forEach(c);
		
	}
}
