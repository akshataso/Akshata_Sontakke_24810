
package com.cybage.fundamentals_2;

public class Assignment_2 {

	public static void main(String[] args) {
	
		Employee [] arr = new Employee[5];
		arr[0]  = new Employee("Alpha",1,"Developer");
		arr[1]  = new Employee("Bravo",2,"QA");
		arr[2]  = new Employee("Charlie",3,"Devops");
		arr[3]  = new Employee("Delta",4,"ALM");
		
		for(Employee emp:arr) {
			if(emp!=null) {
			System.out.println(emp);
			}
		}
		
		System.out.println("Employees added: "+Employee.counter);
	}

}
