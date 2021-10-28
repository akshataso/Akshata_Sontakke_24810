package com.cybage.exceptionhandling;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class BankApplication {
	
	private Map<String, Customer> customers = new HashMap<String, Customer>();

	public BankApplication() {
		super();
	}
	
	public void addCustomer(Customer customer) {
		customers.put(customer.getAccountNumber(), customer);
	}
	
	public void deleteCustomer(String acctNumber) {
		
		if(customers.containsKey(acctNumber))
		{
			customers.remove(acctNumber);
		}
		else
		{
			System.out.println("Account does not exist!!");
		}
	}
	
	public Map<String, Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Map<String, Customer> customers) {
		this.customers = customers;
	}

	public void displayCustomers() {
		
		List<Customer> allcustomers = new ArrayList<Customer>(customers.values());
		allcustomers.forEach(System.out::println);
	}
}


