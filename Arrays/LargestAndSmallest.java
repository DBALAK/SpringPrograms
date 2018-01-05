package com.arrays;

public class LargestAndSmallest {

	public static void main(String[] args) {

		int a[] = {  3, 6, 5, 2, 10,20 }; // 1,2,3,5,6
		// Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println("Smallest element:" + a[0] + "\t Largest element:" + a[a.length - 1]);
	}

}
