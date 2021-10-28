
package com.cybage.oops.assign_1;

public class Manager extends Employee {
	private double allowance;

	@Override
	public double calculateSalary() {
		return super.getSalary() + allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

}
