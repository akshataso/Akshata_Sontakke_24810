package com.cybage.exceptionhandling;



public class Account {

	
	private  double accountNumber;
	private String accountType;
	private double minimumBalance;
	private double currentBalance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(double accountNumber, String accountType, double minimumBalance, double currentBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.minimumBalance = minimumBalance;
		this.currentBalance = currentBalance;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", minimumBalance="
				+ minimumBalance + ", currentBalance=" + currentBalance + "]";
	}
	
	public double calculateInterest() {
		return 0;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException{
		if(this.currentBalance-amount < this.minimumBalance)
		{
			throw new InsufficientBalanceException("Balance is not sufficient");
		}
		else
		{
			this.currentBalance-=amount;
		}
	}
	
	public void addFunds(double amount) {
		
		this.currentBalance+=amount;
	}

}


