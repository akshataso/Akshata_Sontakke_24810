package com.cybage.exceptionhandling;

import java.util.Scanner;


public class ExceptionHandling {

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Enter a number");
			int number = scanner.nextInt();
			
			try {
				int result = 4/number;
			}catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				System.out.println("Inside finally block");
			}
			
		}

	}

}


