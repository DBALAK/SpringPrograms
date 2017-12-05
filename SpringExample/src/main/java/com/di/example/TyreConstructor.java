package com.di.example;

public class TyreConstructor {
	String brand;
	
	public TyreConstructor(String brand) {
		super();
		this.brand = brand;
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}

}
