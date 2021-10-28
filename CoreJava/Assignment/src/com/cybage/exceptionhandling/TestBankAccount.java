package com.cybage.exceptionhandling;

import java.util.HashMap;
import java.util.Map;



public class TestBankAccount {

	public static void main(String[] args) {
		
		Map<String, Customer> customers = new HashMap<String, Customer>();
		Customer customer1 = new Customer("First", "Pune", "abc1", 1000);
		Customer customer2 = new Customer("Second", "Goa", "abc2", 3000);
		Customer customer3 = new Customer("Third", "Mumbai", "abc3", 5000);
		Customer customer4 = new Customer("Fourth", "Pune", "abc4", 3000);
		Customer customer5 = new Customer("Fifth", "Pune", "abc5", 4566);

		customers.put(customer1.getAccountNumber(), customer1);
		customers.put(customer2.getAccountNumber(), customer2);
		customers.put(customer3.getAccountNumber(), customer3);
		customers.put(customer4.getAccountNumber(), customer4);
		customers.put(customer5.getAccountNumber(), customer5);
		
		BankApplication bank = new BankApplication();
		bank.setCustomers(customers);
		
		bank.displayCustomers();
	}

}


