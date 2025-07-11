package com.oop.IS_A;

public class SavingAccount extends Account{

	
	double interestRate;
	
	public SavingAccount(String accountHolderName, long accountNumber, String iFSC_CODE, double balance,double interestRate) {
		super(accountHolderName,accountNumber,iFSC_CODE,balance);
		this.interestRate=interestRate;
		// TODO Auto-generated constructor stub
	}
	
	void calculateInterest(int years)
	{
		 double interest=balance*interestRate*years/100;
		 
		 System.out.println("Interest for : "+years+ " Years : RS : "+interest);
	}
}
