
package com.cybage.oops.assign_5;

public class ArithmeticTester {

	public static void main(String[] args) {
		
	ArithmeticInterface add = (x,y)->x+y;
	ArithmeticInterface multiply = (x,y)->x*y;
	
	System.out.println("Add: "+add.arithmeticOperation(2,3));
	System.out.println("Multiplication: "+multiply.arithmeticOperation(2,3));
		
	}

}
