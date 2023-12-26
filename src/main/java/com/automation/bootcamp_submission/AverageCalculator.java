	
	package com.automation.bootcamp_submission;

	import java.util.Scanner;
	
	public class AverageCalculator {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the first number
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        // Input the second number
	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        // Input the third number
	        System.out.print("Enter the third number: ");
	        double num3 = scanner.nextDouble();

	        // Calculate the average
	        double average = (num1 + num2 + num3) / 3;

	        // Display the result
	        System.out.println("Average: " + average);

	        // Close the scanner
	        scanner.close();
	    }
	}

