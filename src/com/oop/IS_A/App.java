package com.oop.IS_A;

public class App {

	public static void main(String[] args) {
		
		SavingAccount c1=new SavingAccount("Ram",998239283L,"IFSC344232",40000.00,4.5);
	    c1.displayData();
	    c1.deposit(10000.00);
	    c1.withdraw(25000.00);
	    c1.calculateInterest(2);
	    
	    System.out.println("========================================");
	    
	    SavingAccount c2=new SavingAccount("Hari",892748979837L,"IFSC344232",38000.00,4.5);
	    c2.displayData();
	    c2.deposit(20000.00);
	    c2.withdraw(35000.00);
	    c2.calculateInterest(3);
	}
}
