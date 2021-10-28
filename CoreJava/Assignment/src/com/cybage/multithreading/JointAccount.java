
package com.cybage.multithreading;

import java.util.HashSet;
import java.util.Set;

public class JointAccount {
	private int actId;
	private Set<String> acctName = new HashSet<>();
	private double balance;

	public JointAccount(int actId, String name, double balance) {
		this.actId = actId;
		acctName.add(name);
		this.balance = balance;
	}

	public void addAcctName(String name) {
		acctName.add(name);
	}

	public synchronized void withdraw(double amt) {
		if(this.balance>amt) {
		this.balance = this.balance - amt;
	}else {
		System.out.println("Insufficient balance");
	}
	}
	public void deposit(double amt) {
		this.balance = this.balance + amt;
	}

	public double getBalance() {
		return this.balance;
	}

	public int getActId() {
		return actId;
	}

	public void setActId(int actId) {
		this.actId = actId;
	}
	
	

}
