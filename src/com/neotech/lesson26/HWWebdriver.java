package com.neotech.lesson26;

public interface HWWebdriver {
	
	void open();
	
	void close();
	
	String getTitle();
	

}

 interface TakesScreenShot{
	
	 void getScreenShot();
	 
	
}

 interface RemoteWebDriver{
	 
	 void navigate();
	 
 }
 
class  ChromeDriver implements HWWebdriver,TakesScreenShot, RemoteWebDriver  {

	String driver = "Chrome";
	
	@Override
	public String getTitle() {
		String title = "Chrome";
		
		return title;
	}
	@Override
	public void navigate() {
		
		System.out.println("Navigate using " + driver);
		
	}

	@Override
	public void getScreenShot() {
		
		System.out.println("Use " + driver + " to take screenshots");
		
	}

	@Override
	public void open() {
		
		System.out.println("Right click and open with " + driver);
		
	}

	@Override
	public void close() {
	
		System.out.println("Click on the X to close " + driver);
		
	}
	

	
	 
 }
 
class FireFoxDriver implements HWWebdriver,TakesScreenShot, RemoteWebDriver {

	String driver = "Firefox";
	@Override
	public void navigate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getScreenShot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
 
 