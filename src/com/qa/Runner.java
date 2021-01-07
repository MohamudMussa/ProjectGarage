package com.qa;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Garage myGarage = new Garage();

		Vehicle bmw = new Car(1, "Car", 4, "Make1", "Model3", 600);
		Vehicle mo1 = new Motorcycle(2, "MotorCycle", 2, "Make3", "Model3", 500);
		Vehicle bus = new Bus(3, "Bus", 4, "Bus1", "B2", 600);
		Vehicle bus1 = new Bus(4, "Bus", 4, "Bus2", "B13", 500);
		Vehicle astra = new Car(5, "Car", 4, "Make1", "Model3", 60);
		Vehicle mo2 = new Motorcycle(6, "Motorcycle", 2, "Make2", "Model2", 50);

		myGarage.addVehicle(mo2);
		myGarage.addVehicle(astra);
		myGarage.addVehicle(bus1);
		myGarage.addVehicle(bus);
		myGarage.addVehicle(mo1);
		myGarage.addVehicle(bmw);

		System.out.println("The Garage is now open");
		System.out.println("--------------");

		System.out.println("If you would like to FIX a Vehicle press 1");
		System.out.println("If you would like to REMOVE a Vehicle press 2");
		System.out.println("If you would like to DISPLAY all Vehicle press 3");
		System.out.println("If you would like to CLEAR all Vehicle press 4");
		System.out.println("If you would like to EXIT type 100");

		// 1 to fix a car
		// 2 remove a car
		// 3 to fix a car


		
		do {
			
			int a = sc.nextInt();
			switch (a) {

			case 1: {
				System.out.println("Please select which Vehicles you'd like to FIX today by typing the CAR_ID");
				System.out.println("--------------");
				myGarage.printAll();
				System.out.println("--------------");
				int b = sc.nextInt();
				switch (b) {

				case 1:

					myGarage.fixVehicle(bmw);
					break;
				case 2:

					myGarage.fixVehicle(mo1);
					break;
				case 3:

					myGarage.fixVehicle(bus);
					break;
				case 4:

					myGarage.fixVehicle(bus1);
					break;
				case 5:

					myGarage.fixVehicle(astra);
					break;
				case 6:

					myGarage.fixVehicle(mo2);
					break;

				}

			}
			case 2: {
				System.out.println("Please select which Vehicles you'd like to REMOVE today by typing the CAR_ID");
				System.out.println("--------------");
				myGarage.printAll();
				System.out.println("--------------");
				int c = sc.nextInt();
				switch (c) {

				case 1:

					myGarage.removeVehicle(bus1);
					break;

				case 2:

					myGarage.removeVehicle(mo1);
					break;
				case 3:

					myGarage.removeVehicle(bus);
					break;
				case 4:

					myGarage.removeVehicle(bus1);
					break;
				case 5:

					myGarage.removeVehicle(bus1);
				case 6:

					myGarage.removeVehicle(mo2);
					break;

				}

			}
			case 3: {
				switch (a) {
				case 3:

					System.out.println("Here are all the Vehicles that are in your garage today!");
					System.out.println("--------------");
					myGarage.printAll();
					System.out.println("--------------");
					break;

				}

			}
			case 4: {
				switch (a) {
				case 4:

					System.out.println("Here are all the Vehicles that are in your garage today!");
					System.out.println("--------------");
					myGarage.printAll();
					System.out.println("--------------");
					System.out.println("YOUR GARAGE HAS BEEN CLEARED");
					myGarage.emptyGarage();
					break;

				}

			}

			default:
				System.out.println("Thank you for using this beautiful Java program");
				break;

			}
			
		} while (sc.nextInt() != 100);
	}
	
	
}
