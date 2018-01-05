package com.arrays;

public class SortArrayInDesc {

	public static void main(String[] args) {

		int a[] = { 45, 356, 88, 44, 1, 23 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Descending order:");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

}
