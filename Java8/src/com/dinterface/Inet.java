package com.dinterface;

public interface Inet {
	static void print() {
		System.out.println("Inside Inet");
	}
}

class NM {
	public static void main(String[] args) {
		Inet.print();
	}
}
