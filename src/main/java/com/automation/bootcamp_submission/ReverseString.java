package com.automation.bootcamp_submission;

public class ReverseString {


    public static void main(String[] args) {
        // Input string
        String input = "Hello, World!";

        // Call the reverseString method
        String reversedString = reverseString(input);

        // Print the result
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);
    }

    // Function to reverse a string
    private static String reverseString(String str) {
        // Create a StringBuilder object with the given string
        StringBuilder stringBuilder = new StringBuilder(str);

        // Use the reverse() method of StringBuilder to reverse the string
        stringBuilder.reverse();

        // Convert StringBuilder to String and return
        return stringBuilder.toString();
    }
}
