
package com.cybage.fundamentals.assign_1;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Alpha");
		emp1.setDesignation("Developer");

		System.out
				.println("ID: " + emp1.getId() + " Name: " + emp1.getName() + " Designation: " + emp1.getDesignation());
	}

}
