
package com.cybage.oops.assign_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorSort {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Alien", 3, "Devgrp"));
		empList.add(new Employee("alexa", 5, "QA"));
		empList.add(new Employee("Charm", 2, "Devgroup"));
		empList.add(new Employee("Dec", 5, "DevOps"));
		empList.add(new Employee("Emd", 1, "ALMs"));

		System.out.println("List contains: ");
		empList.forEach(System.out::println);

		Collections.sort(empList, (e1, e2) -> e1.getId() - e2.getId());

		System.out.println("\nAfter sorting w.r.t ID:");
		empList.forEach(System.out::println);

		Collections.sort(empList, (e1, e2) -> e1.getName().compareTo(e2.getName()));

		System.out.println("\nAfter sorting w.r.t Name:");
		empList.forEach(System.out::println);
	}

}
