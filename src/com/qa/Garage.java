package com.qa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Garage {

	Scanner sc = new Scanner(System.in);

	List<Vehicle> ListInGarage = new ArrayList<>();

	public void addVehicle(Vehicle v) {
		ListInGarage.add(v);
	//	System.out.println(v.toString() + " " + "has now been added");
	}

	public void removeVehicle(Vehicle v) {

		ListInGarage.remove(v);
		System.out.println(v + "" + "has now been removed");
	}
	
	public void emptyGarage() {

		ListInGarage.clear();
		System.out.println(ListInGarage + "" + "The garage is now empty");

	}
	
	

	public void printAll() {
		ListInGarage.stream().forEach(x -> System.out.println(x));
	}



	// this will fix the damage on the car
	public double fixVehicle(Vehicle v) {

		System.out.println("You want to repair" + " " + v.toString());
		int a = v.getDamageCost();
		double repairCost = a * 5;
		System.out.println("To repair this car it will cost" + " " + "£" + repairCost);
		System.out.println("Press 1 if you would like to repair");

		int e = sc.nextInt();
		switch (e) {

		case 1: {
			System.out.println("Your Vehicle has now been fixed");
			v.setDamageCost(0);
			System.out.println(v.toString());
			System.out.println("---------");
			System.out.println("Thank you for choosing Mussa's Garage");
			break;
		}		default:
			System.out.println("Thank you for using this beautiful Java program");

		}
		return repairCost;
		
	}

}
