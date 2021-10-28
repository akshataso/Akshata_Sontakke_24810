
package com.cybage.collectionsgen.assign_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortedEmpExcep {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			List<Employee> employeeList = new ArrayList<Employee>();
			employeeList.add(new Employee("Alpha", 3, "Developer"));
			employeeList.add(new Employee("Bravo", 1, "QA"));
			employeeList.add(new Employee("Delta", 2, "DevOp"));
			employeeList.add(new Employee("Charlie", 4, "ALM"));

			Collections.sort(employeeList, (e1, e2) -> e1.getName().compareTo(e2.getName()));

			employeeList.forEach(System.out::println);

			System.out.print("Enter employee name: ");
			String name = scanner.next();

			boolean status = employeeList.stream().anyMatch((e) -> e.getName().equals(name));
			if (!status) {
				throw new UserDefExcep("Employee not found");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Goodbye!!!");
		}
	}

}
