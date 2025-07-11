package com.oop.IS_A;

public class Course {

	int courseId;
	
	String title;
	
	String instructor;
	
	
	
	
	public Course(int courseId, String title, String instructor) {
		
		this.courseId = courseId;
		this.title = title;
		this.instructor = instructor;
	}

	void show()
	{
		System.out.println("COurse ID : "+courseId);
		System.out.println("Title : "+title);
		System.out.println("Instructor : "+instructor);
	}
	
	double calculateFee()
	{
		return 0;
	}
	
	String courseType()
	{
		return "Generic";
	}
}
