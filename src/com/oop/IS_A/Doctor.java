package com.oop.IS_A;

public class Doctor extends Hospital {

	String specialization;
	 Doctor(String specialization) {
		 this.specialization=specialization;
		// TODO Auto-generated constructor stub
	}
	 
	 void treatPatient(String disease)
	 {
		 System.out.println("Doctor giving treatment to patient on : "+disease);
	 }
	 
	
}
