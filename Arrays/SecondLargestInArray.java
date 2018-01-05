package com.arrays;

import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {

		int a[]={4,2,5,9,10};  // 2 4 5 9 10
		Arrays.sort(a);
		System.out.println(a[a.length-2]);
	}

}
