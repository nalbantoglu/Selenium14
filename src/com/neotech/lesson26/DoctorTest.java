package com.neotech.lesson26;

public class DoctorTest {

	public static void main(String[] args) {
	
     
		Doctor doc = new Doctor();
		
		doc.setEmail("doctor@gmail.com");
		
		doc.setLicenseID(346454673);
		
		doc.setPhoneNumber(645645636);
		
		
		System.out.println(doc.getEmail());
		System.out.println(doc.getLicenseID());
		System.out.println(doc.getPhoneNumber());

	}

}
