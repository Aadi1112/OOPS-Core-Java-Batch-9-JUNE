package com.oop.IS_A;


public class Patient extends Hospital{

	String patientName;
	
	String problem;
	
	public Patient(String patientName,String problem) {
		this.problem=problem;
		this.patientName=patientName;
		// TODO Auto-generated constructor stub
	}
	
	void payBill()
	{
		System.out.println("Patient paying the Bill");
	}
	
	void registerComplaint()
	{
		System.out.println("Patient Complaint : "+patientName);
	}
	
	public static void main(String[] args) {
		
		
		Doctor doc=new Doctor("Orthopedic");
		doc.treatPatient("CORONO");
		doc.displayHospitalInfo();
		
		Nurse nn=new Nurse();
		nn.giveMedicine("Paracetamol");
		nn.displayHospitalInfo();
		
		Patient patient=new Patient("Vaibhav","Sas lene me dikkat");
		patient.displayHospitalInfo();
		patient.payBill();
		patient.registerComplaint();
	}
}
