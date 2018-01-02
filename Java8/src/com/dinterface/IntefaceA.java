package com.dinterface;

public interface IntefaceA {  //Third rule in java
	default void show() {
		System.out.println("Interface A");
	}

}

interface AB{
	default void show() {
		System.out.println("Interface AB");
	}
}

class AL {
	void show() {
		System.out.println("AL");
	}
}
class C extends A implements IntefaceA{
	public static void main(String[] args) {
		AL obj=new AL();
		obj.show();
	}

}