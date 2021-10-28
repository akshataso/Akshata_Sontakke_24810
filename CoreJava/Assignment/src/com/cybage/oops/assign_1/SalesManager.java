
package com.cybage.oops.assign_1;

public class SalesManager extends Manager {
	private double commission;

	@Override
	public double calculateSalary() {
		return super.calculateSalary() + commission;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

}
