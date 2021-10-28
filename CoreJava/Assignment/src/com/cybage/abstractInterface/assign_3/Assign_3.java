
package com.cybage.abstractInterface.assign_3;

public class Assign_3 {

	public static void main(String[] args) {
		Printable[] printables = new Printable[2];
		Printable animal = () -> System.out.println("I am animal");
		Printable shapes = () -> System.out.println("I am shape");
		printables[0] = animal;
		printables[1] = shapes;
		
		Utility utility = new Utility();
		utility.printAll(printables);
	}

}
