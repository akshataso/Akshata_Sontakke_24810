
package com.cybage.collectionsgen.assign_1;

import java.util.Set;
import java.util.TreeSet;

public class SortedEmp {

	public static void main(String[] args) {
		Set<Employee> employeeSet = new TreeSet<>((e1, e2) -> e1.getId() - e2.getId());
		employeeSet.add(new Employee("Alpha", 3, "Developer"));
		employeeSet.add(new Employee("Bravo", 1, "QA"));
		employeeSet.add(new Employee("Delta", 2, "DevOp"));

		employeeSet.forEach(System.out::println);
	}

}
