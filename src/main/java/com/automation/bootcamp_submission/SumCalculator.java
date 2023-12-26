

		package com.automation.bootcamp_submission;

		import java.util.Scanner;


		public class SumCalculator {
		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Calculate the sum
        double sum = num1 + num2;

        // Display the result
        System.out.println("Sum: " + sum);

        // Close the scanner
        scanner.close();
    }
}

