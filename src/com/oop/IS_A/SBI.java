package com.oop.IS_A;

public class SBI extends RBI {

	//default constructor Non-parametrized
	
	SBI(String s)
	{   super(s);//1 param
		System.out.println("SBI Called");
		//call the parent constructor
	}
	
	
	
	public static void main(String[] args) {
		
		SBI sbi=new SBI("Ram");
		System.out.println(sbi.balance);
		sbi.deposit(10000);
		sbi.withdraw(5000);
		
	}
}
