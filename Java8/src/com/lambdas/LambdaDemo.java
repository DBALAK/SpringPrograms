package com.lambdas;

interface Bala{
	void show();
}
class CA implements Bala{
	public void show() {
		System.out.println("Inside Bala");
	}
}
public class LambdaDemo {
public static void main(String[] args) {
	Bala obj=new CA();
	obj.show();
}
}
