package com.neotech.lesson26;

public class Doctor {
	
	private long licenseID;
	private long phoneNumber;
	private String email;

	
	
	
	
	
	// getter for license ID
		// getter will have a return type same as type of the varible we are returning 
	
	public long getLicenseID()
	{
		return licenseID;
	}

	// getter for phone number 
	 
	public long getPhoneNumber()
	{
		return phoneNumber;
	}
	
	//getter for email
	
	public String getEmail()
	{
		return email;
	}
	
	
	
	
	
	
	// setter for licenseID
		// typical setter will have void return type
		// input paremeter
	    // perform assignment 
	
	public void setLicenseID(long licenseID)
	{
		this.licenseID = licenseID;
		
	}
	
	
	public void setPhoneNumber(long phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	
	
	
	
	// setter for email
		// email can not be emppty
		// email must contain @gmail
	public void setEmail(String email)
	{
		if (!email.isEmpty())
			
		{
			if(email.contains("@gmail"))
		     {
				
				this.email = email;
	     	}
			else // the email does not have @gmail on it 
			{
				System.out.println("You have to use Gmail account");
			}
			
			
		}
		
		else 
		{
			System.out.println("Email can not empty");
		}
//		
	//	we could do this but we wont know if it fails 
		
//		if (!email.isEmpty() && email.contains("@gmail"))
//
//		     {
//				
//				this.email = email;
//	     	}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}

