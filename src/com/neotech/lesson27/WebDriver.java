package com.neotech.lesson27;

 interface WebDriver {
	
	 void open();
	 void close();
	 
	 String getTitle();
	 
}

 
 interface TakesScreenShot{
	 
	 void getScreenShot();
	 
 }
 
 interface RemoteWebDriver extends WebDriver, TakesScreenShot{
	 
	 void navigate();
	 
 }
 
 class ChromeDriver implements RemoteWebDriver{

	@Override
	public void open() {
		System.out.println("chrome driver open");
	}

	@Override
	public void close() {
		
		System.out.println("chrome driver close");
		
	}

	@Override
	public String getTitle() {
		
		return "Neotech";
	}

	@Override
	public void getScreenShot() {
	

		System.out.println("Take screenshot with chrome driver");
	}

	@Override
	public void navigate() {
		
		System.out.println("Navigate on chrome");
		
	}
	 
 }
 
 class FirefoxDriver implements RemoteWebDriver{

	@Override
	public void open() {
		System.out.println("Firefox driver open");
		
	}

	@Override
	public void close() {
		System.out.println("Firefox driver close");
		
	}

	@Override
	public String getTitle() {
		
		return "Neotech";
	}

	@Override
	public void getScreenShot() {
		System.out.println("Take screenshot with firefox driver");
		
	}

	@Override
	public void navigate() {
		System.out.println("Navigate on firefox");
		
	}
	 
	 
 }
 
 class SafariDriver implements RemoteWebDriver{

	@Override
	public void open() {
		System.out.println("Safari driver open");
		
	}

	@Override
	public void close() {
		System.out.println("Safari driver close");
		
	}

	@Override
	public String getTitle() {
		
		return "Neotech";
	}

	@Override
	public void getScreenShot() {
		
		System.out.println("Take screenshot with Safari driver");
		
	}

	@Override
	public void navigate() {
		System.out.println("Navigate on Safari");
		
	}
	 
 }
 
 
 
 
 
 
 