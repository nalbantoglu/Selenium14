package com.neotech.lesson27;

public class WebTest {

	public static void main(String[] args) {
		
		// not allowed 
	//	RemoteWebDriver rwd = new RemoteWebDriver();
		

		RemoteWebDriver rwd = new ChromeDriver(); // up casting 
		
		WebDriver wd = new ChromeDriver(); // up casting 
		
		
		
		ChromeDriver cd = new ChromeDriver();
		FirefoxDriver fd = new FirefoxDriver();
		SafariDriver sd = new SafariDriver();
		
		
		
		// we are not creating pbject, we are vreating an array that contacins
		// object of remoteWebdriver type
		
		RemoteWebDriver [] remoteArray = new RemoteWebDriver[3];
		
		remoteArray [0] = cd;
		remoteArray [1] = fd;
		remoteArray [2] = sd;
		
		for (RemoteWebDriver driver :remoteArray )
		{
			driver.open();
			driver.getScreenShot();
			System.out.println();
			System.out.println(driver.getTitle());
			
			driver.navigate();
			driver.close();
		}
		

	}

}
