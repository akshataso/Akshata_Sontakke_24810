
package com.cybage.collectionsgen.assign_4;

import java.util.Hashtable;

public class BankOperations {

	public static void main(String[] args) {

		Customer customer = new Customer(1, "Alpha");
		BankApplication bankApplication = new BankApplication();
		bankApplication.addNewCustomer(customer);
		bankApplication.depositeAmount("Alpha", "Savings", 500);
		Hashtable<String, Account> hTable = customer.getAccountInfo();
		System.out.println(hTable.get("Savings").getBalance());

	}

}
