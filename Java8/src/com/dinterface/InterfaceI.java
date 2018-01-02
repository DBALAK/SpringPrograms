package com.dinterface;

public interface InterfaceI {
	void show(); // public and abstract by default

	default void showA() {
		System.out.println("In show A");
	}
}

class B implements InterfaceI {
	@Override
	public void show() {
		System.out.println("In show method");
	}
}

class A {
	public static void main(String[] args) {
		B b = new B();
		b.show();
		b.showA();
	}
}