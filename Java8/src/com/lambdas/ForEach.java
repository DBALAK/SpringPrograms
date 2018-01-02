package com.lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {

		List<Integer> lst=Arrays.asList(1,2,3,4);
		System.out.println("using for loop"); //external iterators
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
		
		System.out.println("Using enhanced for Loop");
		for(int i:lst) {
			System.out.println(i);
		}
		
		System.out.println("Using for Each Method"); //internal iterations //faster than normal for loop
		lst.forEach(i -> System.out.println(i));   // -> lambda expression  //Consumer Interface
		
	}

}
