package com.neotech.lesson21;

public class ChemistryTeacher extends Teacher {
	
	
	boolean teachesChemistry;
	
	public void doesExperiments()
	{
		System.out.println(name + " does Experiments");
	}
	
	
	
	public static void main(String[] args) {
		
		
		ChemistryTeacher ct = new ChemistryTeacher();
		
		ct.name = "Iana";
		ct.teachesChemistry = true;
		
		ct.teaches();
		ct.doesExperiments();
		
		
	}

}
