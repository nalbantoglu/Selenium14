package com.neotech.lesson26;

public class Registration {
	
	
	/*
	 * Homework 1:
        Create Registration Class in which you would have variables as email, userName and password that
           have an access scope only within its own class.
         After creating an object of the class user should be able to call methods and in each method separately
    pass values to set users email, username and password.

    Requirements:
     Valid email consider to be only yahoo!
      Valid userName and password cannot be empty and should be of length larger than 6 characters.
      Also valid password cannot contain userName.
	 */
	
	// getters 
   public String getEmail() {
		return email;
	}
   
  
	public String getUserName() {
		return userName;
	}
	
	
	public String getPassword() {
		return password;
	}
	
	
	//Setters
	public void setEmail(String email) {
		
		
		// Valid email consider to be only yahoo!
		if(email.contains("yahoo"))
		{
			this.email = email;
			
		}
		else
		{
			System.out.println("Must use yahoo email");
		}
		
		
	}
	
	// Valid userName and password cannot be empty and should be of length larger than 6 characters.
  
	public void setUserName(String userName) 
	{
		if (!userName.isEmpty())
		{
			if((userName.length() >= 6))
			{
				this.userName = userName;
			}
			else 
			{
				System.out.println("username must be longer that 6 character");
			}
			
		}
		else 
		{
			System.out.println("usernama can not be empty");
		}
	
		
	}
	
	 //Also valid password cannot contain userName.
	
	public void setPassword(String password) 
	{
		if(!password.isEmpty())
		{
			if (password.contains(userName))
			{
				System.out.println("Password can not contain username");
			}
			if (password.length() >= 6)
			{
				this.password = password;
			}
			else 
			{
				System.out.println("Password must be longer than six character");
			}
			
		}
		else 
		{
			System.out.println("Password CAN NOT be empty");
		}
			
		}
	
	private	String email;
	private String userName;
	private String password;
	
	
}

