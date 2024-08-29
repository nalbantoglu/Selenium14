package com.neotech.lesson21;

public class USA {
	
	
	
	// instance variables 
	String state, stateCapital;
	
	
	
	
	

	public USA(String state, String stateCapital) {
		
		
		this.state = state;
		this.stateCapital = stateCapital;
		
		
		// lets create some methods
		
	}

	public void displayStates()
	{
		System.out.println(state);
	}
	
	public void displayStateCapital()
	{
		System.out.println(stateCapital);
	}
	
	public void displayInfo()
	{
		this.displayStates();  // calling method inside another method to display state 
		
		displayStateCapital(); //  calling method inside another method to display state. we dont have to write this. becasue java knows  
	}





	public static void main(String[] args) {
		

		USA us1 = new USA("NY","Albany");
				
		us1.displayInfo();

	}

}
