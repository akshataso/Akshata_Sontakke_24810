
package com.cybage.intro;

/*
 * Account class defining constructors and getter,setters.
 */
public class Assignment_4 {
	private double balance;
	private int acctId;
	private String accType;

	public Assignment_4(int initBalance) {
		balance = initBalance;

	}

	public Assignment_4(int initBalance, int acctId) {
		balance = initBalance;
		this.acctId = acctId;

	}

	public Assignment_4(int initBalance, int acctId, String accType) {
		balance = initBalance;
		this.acctId = acctId;
		this.accType = accType;
	}

	public int getAcctId() {
		return acctId;
	}

	public void setAcctId(int acctId) {
		this.acctId = acctId;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;

	}

	public void withdraw(double amt) {
		if (balance > 0) {
			balance = balance - amt;
		} else {
			System.out.println("Balance is insufficient");
		}
	}

}
