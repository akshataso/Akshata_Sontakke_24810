
package com.cybage.collectionsgen.assign_4;

import java.util.Hashtable;

public class Customer {
	private String custName;
	private int acctNo;
	private Hashtable<String, Account> accountInfo = new Hashtable<>();

	public Customer(int  acctNo,String custName) {
	this.acctNo = acctNo;
	this.custName = custName;
	}
	
	public void depositAmount(String accType, double amount) {
		accountInfo.put(accType, new Account(amount));
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}

	public Hashtable<String, Account> getAccountInfo() {
		return accountInfo;
	}

	public void setAccountInfo(Hashtable<String, Account> accountInfo) {
		this.accountInfo = accountInfo;
	}

}
