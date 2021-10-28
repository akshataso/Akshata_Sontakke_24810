
package com.cybage.oops.assign_2;

public class BankAccount {
	private double balance;
	private double interest;

	public BankAccount(double balance, double interest) {
		super();
		this.balance = balance;
		this.interest = interest;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

}
