package com.neotech.lesson23;

public class UserClassTest  {

	public static void main(String[] args) {
		
 
		UserClass uc = new UserClass();
		
		System.out.println(uc.name + " " + uc.mobileNumber);
		
		UserInfo ui = new UserInfo("Paul" , 345345345l , "123 main");
		
		ui.userDetails();
		
	}

}
