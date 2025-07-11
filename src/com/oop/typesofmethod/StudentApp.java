package com.oop.typesofmethod;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student s1 = null, s2 = null, s3 = null;

		while (true) {

			System.out.println("1.Add Student");// 3 student
			System.out.println("2.Show All Student");
			System.out.println("3.Total Count.");
			System.out.println("4.Exit");

			System.out.println("Enter choice..");
			int choice = sc.nextInt();// 1

			switch (choice) {
			case 1:
				if (Student.getTotalStudents() == 3) {
					System.out.println("Only 3 Students allowed..");
					break;
				}
				Student.collegeName="MIT";
				System.out.println("Enter Name : ");
				String name = sc.next();
				System.out.println("Enter Age :");
				int age = sc.nextInt();

				if (s1 == null)// FALSE
				{
					s1 = new Student(name, age);
				} else if (s2 == null)// false
				{
					s2 = new Student(name, age);
				} else {
					s3 = new Student(name, age);
				}

				System.out.println("Student added succes..");
				break;

			case 2:
				if (s1 != null) {
					s1.displayDetails();
				}
				if (s2 != null) {
					s2.displayDetails();
				}
				if (s3 != null) {
					s3.displayDetails();
				}
				break;

			case 3:
				System.out.println("total Students ...: " + Student.getTotalStudents());
				break;

			case 4:
				System.out.println("Exiting....");
				return;

			default:
				System.out.println("Invalid choice..");
			}
		}
	}
}
