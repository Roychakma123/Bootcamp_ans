package com.automation.bootcamp_submission;

		
		public class Example_of_Exception {

	    public static void main(String[] args) {
	        int numerator = 10;
	        int denominator = 0;

	        try {
	            // Attempting to divide by zero
	            int result = numerator / denominator;

	            // This line will not be reached if an exception occurs
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            // Handling the exception
	            System.out.println("Error: Division by zero is not allowed.");
	            // Optionally, print information about the exception
	            System.out.println("Exception details: " + e.getMessage());
	        }

	        // The program continues executing after handling the exception
	        System.out.println("Program continues...");
	    }
	}

