package com.arrays;

public class DuplicatesInArray {
	public static void main(String[] args) {
		String[] str = { "abc", "def", "mno", "xyz", "pqr", "xyz", "def", "def" };

		for (int i = 0; i < str.length - 1; i++) {
			for (int j = i + 1; j < str.length - 1; j++) {
				if ((str[i].equals(str[j]))) {
					System.out.println("Duplicate Element is : " + str[j]);
				}
			}
		}
	}
}