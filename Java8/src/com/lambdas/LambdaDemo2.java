package com.lambdas;

interface BA {
	void show(int i);
}

public class LambdaDemo2 {
	public static void main(String[] args) {
		BA obj;
		obj = i -> System.out.println("Hello"+i);
		obj.show(6);
	}
}
