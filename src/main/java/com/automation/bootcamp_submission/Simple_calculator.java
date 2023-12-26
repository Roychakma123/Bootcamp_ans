package com.automation.bootcamp_submission;

import java.util.Scanner;

	public class Simple_calculator {
	
		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input operation
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Input second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform calculation based on the selected operation
        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return;
        }

        // Display the result
        System.out.println("Result: " + result);

        // Close the scanner
        scanner.close();
    }
}
