package com.oop.typesofvariables;

public class Practice {
	
	
	void add(int x, int y)//parameters
	{
		System.out.println(x+y);
	}
	
	//2
	
	void m1()
	{
		System.out.println("Good Morning");
	}
	
	String m2()
	{
		return "Ram";
	}
	
	double m3(char c)
	{
		System.out.println(c);
		return 11.11;
	}
	
	
	public static void main(String[] args) {
		
		Practice pp=new Practice();
		double d=pp.m3('A');
		System.out.println(d);
		String x=pp.m2();
		System.out.println(x);
		pp.add(100,200);//argument
		pp.m1();
		pp.m1();
		
	}
	
	
	
	
	
	
	

}
