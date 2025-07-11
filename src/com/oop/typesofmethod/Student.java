package com.oop.typesofmethod;

public class Student {

	static String collegeName;
	  int id;//unique id i want
	  String name;
	  int age;
	static int count=0;//same for each object
	  
	  Student(String name,int age) //object banne
	  {
		  this.id=generateId(); //we are calling static method in constructor
		  this.name=name;
		  this.age=age;
		  count++;//1
	  }
	  //instance method --> for each object it will different
	  void displayDetails()
	  {
		  System.out.println("ID : "+id+ ", Name : "+name+", Age : "+age+", CollegeName : "+collegeName);
	  }
	  
	  static int generateId()
	  {
		  return 1000+count+1;//1000+1+1 => 1002
	  }
	  
	  static int getTotalStudents()
	  {
		  return count;
	  }
	  
//	  public static void main(String[] args) {
//		  
////		 int id=generateId();
////		  System.out.println(id);
//		
//		  Student.collegeName="MIT";
//		
//		  Student s1=new Student("Ravi", 23);
//		  s1.displayDetails();
//		                                        
//		  Student s2=new Student("Shyam", 26);
//		  s2.displayDetails();
//		  
//		  Student s3=new Student("Aakash", 29);
//		  s3.displayDetails();
//		  
//		  int count= getTotalStudents();
//			 System.out.println(count);
//	}
}
