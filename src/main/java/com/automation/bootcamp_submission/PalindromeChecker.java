	
	
	package com.automation.bootcamp_submission;
	
	import java.util.Scanner;

		public class PalindromeChecker {
			
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the string
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();

	        // Check if the string is a palindrome
	        if (isPalindrome(inputString)) {
	            System.out.println("\"" + inputString + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + inputString + "\" is not a palindrome.");
	        }

	        // Close the scanner
	        scanner.close();
	    }

	    // Function to check if a string is a palindrome
	    private static boolean isPalindrome(String str) {
	        // Remove non-alphanumeric characters and convert to lowercase
	        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        // Compare the original and reversed strings
	        String reversedStr = new StringBuilder(cleanStr).reverse().toString();
	        return cleanStr.equals(reversedStr);
	    }
	}

