
package com.cybage.oops.assign_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			boolean status = false;
			List<Employee> empList = new ArrayList<>();
			while (!status) {
				System.out.println("\n-------Menu------");
				System.out.println("1.Enter Data\n2.Display Data\n3.Exit\n");

				switch (scanner.nextInt()) {
				case 1:
					System.out.println("Enter name, id and designation: ");
					empList.add(new Employee(scanner.next(), scanner.nextInt(), scanner.next()));
					break;
				case 2:
					System.out.println("Employee Details:");
					empList.forEach(System.out::println);
					break;
				case 3:
					System.out.println("GoodBye!!!");
					status = true;
					break;
				default:
					System.out.println("Please choose properly");
					break;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
