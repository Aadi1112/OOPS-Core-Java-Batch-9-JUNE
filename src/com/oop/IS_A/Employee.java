package com.oop.IS_A;

public class Employee extends Manager{
	int id;
	String name;
	//this call - it is used to call currnet class constructor
    //this call must be use inside constructor first line only..
	
	void work()
	{
		System.out.println("EMployee is doing his work");
	}
	
	void salary(int id)
	{
		super.work();
		this.work();
		this.id=10;
		
		id=300;
	}
	
	Employee(String name)
	{   this(10);//1 param constructor is going to call
		System.out.println("0 param Constructor");
	   this.name=name;
	}
	
	Employee(int a)
	{  this(10,20);
		System.out.println("1 param constructor");
	}
	Employee(int a, int b)
	{
		System.out.println("2 param constructor");
	}
	
	public static void main(String[] args) {
		
		Employee e=new Employee("Ram");
		e.salary(11);
	}
}
