package com.oop.typesofvariables;

public class BankAccount {
	
	
	//Employee - static variable -> CompanyName ,dep 
	//Instance variable -> id , name , salary , address , age , mobileNo
    //static method -> depUpdate()
	//Instance method - display()
	
	static String bankName;//static variable / Non-Instance State Bank Of India
	
	static double interestRate; //common for all obj
	
	double balance;  //instance /Non-static 
	
	String accountHolderName;//instanec / Non-static
	
	
	BankAccount(double balance,String accountHolderName)
	{
		this.balance=balance;
		this.accountHolderName=accountHolderName;
	}
	
	static void updateInterestRate(double newInterestRate)
	{
		interestRate=newInterestRate;
	}
	
	
	void display() //instance method
	{
		System.out.println("Bank Name     : "+bankName);
		System.out.println("InterestRate  :"+interestRate);
		System.out.println("AccountHolder :"+accountHolderName);
		System.out.println("Balance       :"+balance);
		System.out.println("==================================");
		
	}
	
	public static void main(String[] args) {
		
		BankAccount.bankName="State Bank Of India";
		BankAccount.interestRate=3.5;
		
		
		BankAccount ravi=new BankAccount(2000.00,"Ravi");
		ravi.display();
		
		BankAccount hari=new BankAccount(5000.00,"Hari");
		hari.display();
		
		BankAccount.updateInterestRate(4.5);
		
		System.out.println("After the Update ");
		
		ravi.display();
		
		hari.display();
	}
}
