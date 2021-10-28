package com.cybage.exceptionhandling;


public class CurrentAccount extends Account {
	
	private int interest;

	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(double accountNumber, String accountType, double minimumBalance, double currentBalance, int interest) {
		super(accountNumber, accountType, minimumBalance, currentBalance);
		this.interest = interest;
	}
	
	@Override
	public double calculateInterest() {
		return (super.getCurrentBalance()*(this.interest/100));
	}

}


