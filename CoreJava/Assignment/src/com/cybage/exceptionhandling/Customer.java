package com.cybage.exceptionhandling;



public class Customer {

	private String name;
	private String address;
	private String accountNumber;
	private double currentBalance;
	private Account account;
	
	public Customer() {
		super();
	}
	public Customer(String name, String address, String accountNumber, double currentBalance) {
		super();
		this.name = name;
		this.address = address;
		this.accountNumber = accountNumber;
		this.currentBalance = currentBalance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", accountNumber=" + accountNumber
				+ ", currentBalance=" + currentBalance + "]";
	}
	
	
}


