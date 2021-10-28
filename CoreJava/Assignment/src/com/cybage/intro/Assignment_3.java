
package com.cybage.intro;

/*
 * Describing access modifiers
 * 
 */
public class Assignment_3 {
	protected String name;
	private double salary;
	public String designation;
	 int id;

	
	public static void main(String[] args) {
		Assignment_3 assign = new Assignment_3();
System.out.println(" Id: "+assign.id+"Name: "+assign.getName()+" Designation: "+assign.designation+" salary: "+assign.getSalary());
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
