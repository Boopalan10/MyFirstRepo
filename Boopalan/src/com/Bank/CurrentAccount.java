package com.Bank;

public class CurrentAccount extends Account implements MaintenanceCharge{

	public CurrentAccount(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateMaintenanceCharge(float noOfYears) {
		// TODO Auto-generated method stub
		int m=100;
		float MaintenanceCharge = ( m* noOfYears) + 200;
		return MaintenanceCharge;
	}

}
