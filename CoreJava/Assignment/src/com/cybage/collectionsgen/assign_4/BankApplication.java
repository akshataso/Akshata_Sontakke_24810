
package com.cybage.collectionsgen.assign_4;

import java.util.Hashtable;

public class BankApplication {
	private Hashtable<String, Customer> customerInfo = new Hashtable<>();

	public void addNewCustomer(Customer customer) {
		customerInfo.put(customer.getCustName(), customer);
	}

	public void depositeAmount(String name, String accType, double amount) {
		customerInfo.get(name).depositAmount(accType, amount);
	}
}
