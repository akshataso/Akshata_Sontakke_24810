package com.cybage.exceptionhandling;


public class ThrowsTest {

	public static void main(String[] args) {
		
		ThrowsTest throwstest = new ThrowsTest();
		try {
			throwstest.print();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void print() throws ArithmeticException{
		throw new ArithmeticException();
	}

}


