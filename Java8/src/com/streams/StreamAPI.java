package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(1,2,3,4);
		lst.parallelStream().forEach(i -> System.out.println(i)); //based on no. of cores available it will create the thread and
																   //process it accordingly
		lst.stream().filter(i-> {
			System.out.println("hi");
			return true;
		}).findFirst();					// Stream is Lazy
		
	
		lst.stream().filter(i-> {
					System.out.println("hi");
					return true;
					}).findFirst().orElse(0);
		
		
		List<String> values=Arrays.asList("bvala ","asfsdf ","asfaf");
		Stream<String> s=values.stream();
		s.forEach(System.out::print);
		//s.forEach(System.out::print); throws IllegalStateException , not preservance
		
		
	}

}
