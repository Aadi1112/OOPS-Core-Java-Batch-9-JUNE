package com.oop.IS_A;

public class Account extends Bank {
	
	 String accountHolderName;
	 long accountNumber;
	 String IFSC_CODE;
	 double balance;
	 
	 

	public Account(String accountHolderName, long accountNumber, String iFSC_CODE, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		IFSC_CODE = iFSC_CODE;
		this.balance = balance;
	}

	void displayData()
	{
		System.out.println("BankName: "+bankName);
		System.out.println("Name : "+accountHolderName);
		System.out.println("AccountNo :"+accountNumber);
		System.out.println("IFSCCode: "+IFSC_CODE);
		System.out.println("Balance :"+balance);
	}


//	public Account() {
//		super();
//		System.out.println("Account const");
//		// TODO Auto-generated constructor stub
//	}
	
	void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Deposited amount Rs : '"+amount+"'...:After Deposit RS :  "+balance);
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	
	
	void withdraw(double amount)
	{
		if(amount>0)
			
		{
			if(amount<=balance)
			{
				balance-=amount;
				System.out.println("Withdrawan RS :'"+amount+"'  after withdraw RS : "+balance);
			}
			else
			{
				System.out.println("Insuffient balance");
			}
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	
	
	
}
