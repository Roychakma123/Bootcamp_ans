package com.automation.bootcamp_submission;

		

		//Functional interface with a single abstract method (SAM)
		interface MathOperation {
			int operate(int a, int b);
}

		public class LambdaExample {
			public static void main(String[] args) {
     // Using a lambda expression to implement the MathOperation interface
     MathOperation addition = (a, b) -> a + b;
     MathOperation subtraction = (a, b) -> a - b;
     MathOperation multiplication = (a, b) -> a * b;
     MathOperation division = (a, b) -> a / b;

     // Performing operations using lambda expressions
     System.out.println("Addition: " + operate(10, 5, addition));
     System.out.println("Subtraction: " + operate(10, 5, subtraction));
     System.out.println("Multiplication: " + operate(10, 5, multiplication));
     System.out.println("Division: " + operate(10, 5, division));
 }

			// Method that takes a MathOperation and performs the operation
			private static int operate(int a, int b, MathOperation operation) {
				return operation.operate(a, b);
 }
}

