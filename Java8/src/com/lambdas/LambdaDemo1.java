package com.lambdas;

interface AL {
	void show();
}

public class LambdaDemo1 {
	public static void main(String[] args) {
		AL obj = new AL() {
			@Override
			public void show() { // Annonymous Inner class
				System.out.println("Hello");

			}
		};
		obj.show();
	}
}
