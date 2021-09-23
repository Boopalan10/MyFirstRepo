package com.Bank;

public class SavingAccount extends Account implements MaintenanceCharge  {

	public SavingAccount(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
		
	}

	@Override
	public float calculateMaintenanceCharge(float noOfYears) {
		
		int m=50;
		float MaintenanceCharge = ( m* noOfYears) + 50;
		return MaintenanceCharge;
	}

}
