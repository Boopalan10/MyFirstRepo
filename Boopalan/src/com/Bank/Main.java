package com.Bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Saving Account");
		System.out.println("2.Current Account");
		System.out.println("Enter your choice :");
		int n = sc.nextInt();
		if(n==1)
		{
			System.out.println("Enter the Account Number: ");
		    String acno=sc.next();
		    System.out.println("Enter the Customer Name: ");
		    String acname=sc.next();
		    System.out.println("Enter the Balance Amount: ");
		    double bal=sc.nextDouble();
		    System.out.println("Enter the No of years ");
		    float noofyrs=sc.nextFloat();
		    
		    SavingAccount sa = new SavingAccount(acno,acname,bal);
		    
		    System.out.println("Customer Name: " +sa.getCustomerName());
		    System.out.println("Account Number: " +sa.getAccountNumber());
		    System.out.println("Account Balance: " +sa.getBalance());
		    System.out.println("Maintenance Charge for Current Account is " +sa.calculateMaintenanceCharge(noofyrs));  
		 
		}
		if(n==2)
		{
			System.out.println("Enter the Account Number: ");
		    String acno=sc.next();
		    System.out.println("Enter the Customer Name: ");
		    String acname=sc.next();
		    System.out.println("Enter the Balance Amount: ");
		    double bal=sc.nextDouble();
		    System.out.println("Enter the No of years ");
		    float noofyrs=sc.nextFloat();
		    
		    CurrentAccount ca = new CurrentAccount(acno,acname,bal);
		    
		    System.out.println("Customer Name: " +ca.getCustomerName());
		    System.out.println("Account Number: " +ca.getAccountNumber());
		    System.out.println("Account Balance: " +ca.getBalance());
		    System.out.println("Maintenance Charge for Current Account is " +ca.calculateMaintenanceCharge(noofyrs));  
		 
		}
	     
	}	

}
