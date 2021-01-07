package com.qa;

public class Bus extends Vehicle{
	

	public Bus(int CarID, String type, int wheels, String make, String model, int damageCost) {
		super(CarID, type, wheels, make, model, damageCost);
		// TODO Auto-generated constructor stub
	}




	public void soundOfHorn() {
		System.out.println("BEEEEEEEEEP BEEEEEEEP");
	}

}
