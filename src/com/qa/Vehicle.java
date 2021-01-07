package com.qa;


public class Vehicle {
	
	int CarID;
	String Type;
	int Wheels;
	String Make;
	String Model;
	int DamageCost;
	
	
	
	


	

	public Vehicle(int carID, String type, int wheels, String make, String model, int damageCost) {
		super();
		CarID = carID;
		Type = type;
		Wheels = wheels;
		Make = make;
		Model = model;
		DamageCost = damageCost;
	}



	@Override
	public String toString() {
		return "Vehicle [CarID=" + CarID + ", Type=" + Type + ", Wheels=" + Wheels + ", Make=" + Make + ", Model="
				+ Model + ", DamageCost=" + DamageCost + "]";
	}



	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public int getWheels() {
		return Wheels;
	}

	public void setWheels(int wheels) {
		Wheels = wheels;
	}

	public String getMake() {
		return Make;
	}

	public void setMake(String make) {
		Make = make;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getDamageCost() {
		return DamageCost;
	}

	public void setDamageCost(int damageCost) {
		DamageCost = damageCost;
	}
	
	

	public int getCarID() {
		return CarID;
	}

	public void setCarID(int carID) {
		CarID = carID;
	}

	public void soundOfHorn() {
		System.out.println("A Vehicle is here");

	}

}
