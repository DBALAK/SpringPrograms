package com.arrays;

public class SumOfArrayElmnts {

	public static void main(String[] args) {

		int a[] = { 2, 6, 8, 9, 3 }, sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Without Recursion:");
		System.out.println(sum);
		int sum1 = sumWithRecursion(a, a.length - 1);
		System.out.println("With Recursion:");
		System.out.println(sum1);

	}

	private static int sumWithRecursion(int[] a, int n) {

		if (n == 0) {
			return a[n];

		} else {
			return a[n] + sumWithRecursion(a, n - 1);
		}

	}

}
