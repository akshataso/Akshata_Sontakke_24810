package com.cybage.exceptionhandling;


public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee() {
		super();
	}



	public double calculateSalary() {
		return salary;
	}
}

class Manager extends Employee{
	
	private double allowance;
	public Manager(int id, String name, double salary,double allowance)
	{
		super( id,  name,  salary);
		this.allowance = allowance;
	}
	
	@Override
	public double calculateSalary() {
		return super.calculateSalary()+allowance;
	}
}

class SalesManager extends Manager{
	
	private double commission;
	
	public SalesManager(int id, String name, double salary,double allowance,double commission)
	{
		super( id,  name,  salary, allowance);
		this.commission = commission;
	}
	
	@Override
	public double calculateSalary() {
		return super.calculateSalary()+commission;
	}
}
