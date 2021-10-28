
package com.cybage;

public class Account {
	private double balance;

	public Account(int initBalance) {
		balance = initBalance;

	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;

	}

	public void withdraw(double amt) {
		if(balance>0) {
		balance = balance - amt;
		}else {
			System.out.println("Balance is insufficient");
		}
	}

}
