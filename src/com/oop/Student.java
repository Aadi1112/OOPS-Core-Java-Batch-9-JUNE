package com.oop;

public class Student {
	
	
	Student()
	{
		System.out.println("this is constructor");
	}
	
	
	
	
	

//	int id=199;//this way is wrong
//	
//	String name="Ram";//this is wrong
	
	
	// 3 bar -- 3 hours  -> 3 hours
	int id;//0
	
	String name;//null
	
	String address;
	
	String mobileNo;
	
	int age;
	
	String adharCardNo;
	
	String panCardNo;
	
	double marks;
	
	long parentMobileNo;
	
	String dob;
	
	String collegeName;
	
	void setStudent(int i,String s,String ss,String sss,int a,String ad,String p,double m,long pm,String d,String c)
	{
		id=i;
		name=s;
		mobileNo=ss;
		address=sss;
		age=a;
		adharCardNo=ad;
		panCardNo=p;
		marks=m;
		parentMobileNo=pm;
		dob=d;
		collegeName=c;
		
		
	}
	
	void show()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
		System.out.println(adharCardNo);
		System.out.println(age);
		System.out.println(dob);
		System.out.println(collegeName);
		System.out.println(panCardNo);
		System.out.println(mobileNo);
		System.out.println(parentMobileNo);
	}
	
	
	//72 Variables - Trainee
	
	public static void main(String[] args) {
		
		Student shubham=new Student();//4 + 6 +10bytes   300 Students
		
		shubham.setStudent(111, "shubham", "09090909", "Pune", 25, "989889898", "ijefnji34", 56, 423432434l, "21-11-2000", "MIT");
		
		shubham.show();
		
		
		
		System.out.println("================================");
		
		
		Student shruti=new Student();
		
		shruti.setStudent(222, "Shruti", "938498394824", "PUNE", 24, "98234892349823048", "IXID98344", 88, 32948903284394l, "12-12-2000", "DYPATIL");
		
		shruti.show();
		
	}
}
