package com.cybage.exceptionhandling;

import java.util.Scanner;



public class TestException {

	public static void main(String[] args) {
		
		TestException test = new TestException();
		try(Scanner scanner = new Scanner(System.in)){
			
			try {
				System.out.println("Enter a positive integer");
				int number = scanner.nextInt();		
				System.out.println(test.squareRoot(number));
			}catch (NegativeNumberException e) {
				System.out.println(e.getMessage());
			}
			
		}

	}
	
	public double squareRoot(double number) throws NegativeNumberException {
		
		if(number<0) {
			throw new NegativeNumberException("Negative number is not allowed");
		}
		else {
			return Math.sqrt(number);
		}
	}

}


