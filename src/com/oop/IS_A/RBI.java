package com.oop.IS_A;

public class RBI {

	double balance;
	double interestRate;
	
	
	RBI()
	{
		System.out.println("RBI Called");
		
	}
	
	RBI(String a)
	{
		balance=1000.0;
		System.out.println("RBI 1 Param "+a);
	}
	
	void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Deposited .."+balance);
		}
	}
	
	void withdraw(double amount)
	{
		if(amount>0)
		{
			if(amount<=balance)
			{
				balance-=amount;
				System.out.println("Withdrawan : "+balance);
			}
		}
	}
}
