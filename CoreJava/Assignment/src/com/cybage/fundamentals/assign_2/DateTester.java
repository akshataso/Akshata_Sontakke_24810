
package com.cybage.fundamentals.assign_2;

public class DateTester {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		date.setDay(21);
		date.setMonth("August");
		date.setYear(2021);
		System.out.println(date);
	}

}
