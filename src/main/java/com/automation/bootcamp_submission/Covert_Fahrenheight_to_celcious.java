package com.automation.bootcamp_submission;

import java.util.Scanner;

public class Covert_Fahrenheight_to_celcious {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to CelsiusFahrenheit
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.println("Temperature in Celsius: " + celsius);

        // Close the scanner
        scanner.close();
    }
}
