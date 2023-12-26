package com.automation.bootcamp_submission;

	
		public class Car {
		    // Attributes or fields of the Car class
		    String make;
		    String model;
		    int year;

		    // Default constructor (no-argument constructor)
		    public Car() {
		        // Initialization of attributes with default values
		        make = "Unknown";
		        model = "Unknown";
		        year = 0;
		    }

		    // Method to display information about the car
		    public void displayInfo() {
		        System.out.println("Make: " + make);
		        System.out.println("Model: " + model);
		        System.out.println("Year: " + year);
		    }

		    public static void main(String[] args) {
		        // Creating an instance of the Car class using the default constructor
		        Car myCar = new Car();

		        // Calling the displayInfo method to print information about the car
		        myCar.displayInfo();
		    }
		}
