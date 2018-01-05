package com.arrays;

public class ReverseElmntInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int start = 0, end = a.length - 1;
		while (start <= end) {
			int t = a[start];
			a[start] = a[end];
			a[end] = t;
			start++;
			end--;
		}
		System.out.println("Reversed Array:");
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);

	}

}
