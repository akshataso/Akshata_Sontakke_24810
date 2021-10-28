package com.cybage.abstractInterface.assign_2;

public abstract class ICICI implements Bank,Insurance {
	@Override
	public void balance() {
		System.out.println("ICICI Acct Balacne");
	}
		
	@Override
	public void insuranceSum() {
		System.out.println("ICICI Insurance");
	}
}
