package com.neotech.lesson28;

abstract class Flower {
	
	
	String type;
	
	public Flower (String type)
	{
		this.type = type;
		
	}
	
	public abstract void bloom();
	

}

class Rose extends Flower{

	public Rose(String type) {
		super(type);
		

	}

	@Override
	public void bloom() {
		
System.out.println(type + " blooms in summer");
		
	}
	
	
}

class Tulip extends Flower{

	public Tulip(String type) {
		super(type);
		
	}

	@Override
	public void bloom() {
	
		System.out.println(type + " blooms in spring");
	}
	
}

class SunFlower extends Flower{

	public SunFlower(String type) {
		super(type);
		
		
	}

	

	@Override
	public void bloom() {
	
		System.out.println(type + " blooms in fall");
	}
	
}

















