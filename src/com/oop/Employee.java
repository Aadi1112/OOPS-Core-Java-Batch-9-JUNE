package com.oop;

class Employee {
	
	
	//create the 5 objets of employee and inialize it using best way...
	//then create Register and Login methods in employee class...
	//in register method check if employee from Pune , Mumbai , HYD then only register the employee..
	//check there >3 employee dep is IT or not ... if dep is it then register that employee only..
	//for loop -> iterate emp.dep.equlas("IT")>3 {register }
	//if employee salary > 80000  then assign the new role Lead to particular..
	//increment the salary by 5000....
	
	
	
	
	//Non-Parameterized constructor (Default constructor)
//	Employee()
//	{
//		System.out.println("this is constructor");
//	}
//	
	//Parameterized constructor...
	//instance variable
	
	//User -> id , name , address , age , mobileno, dob, pancardno, adharcardno,ismarried
	// User user=new User(111);
	//user.id=111;
	//user.setUser(111)
	
	
	//Product -> id , name , price , category...
	//inialze object using 3 ways ... direct variable, set method, cosntructor
	
	
	int id;
	String name;
	double salary;
	String dep;
	
	
	
	void show()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(dep);
		
		System.out.println("========================");
	}
	
	
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		
//		Employee e1=new Employee(10000,"Ram",80000,"IT");//1
//		e1.show();
//		
//		Employee e2=new Employee(20000,"SHyam",70000,"IT");//1
//		e2.show();
		
//		Employee e1=new Employee();//1
//		
//		Employee e2=new Employee();//1
	}
	
}
