package com.qa;

public class Motorcycle extends Vehicle {
	
	
	public Motorcycle(int CarID, String type, int wheels, String make, String model, int damageCost) {
		super(CarID, type, wheels, make, model, damageCost);
		// TODO Auto-generated constructor stub
	}



	public void soundOfHorn() {
		System.out.println("Keek Keek");
	}

}
