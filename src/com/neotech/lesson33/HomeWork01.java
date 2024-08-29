package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class HomeWork01 {

	public static void main(String[] args) throws IOException {
		
/*
		
		Homework 1:
		    Create a PROPERTY file to store following configurations:
		        browser=
		        url=
		        username=
		        password=
		        */
		

	//	String filelocation = "/Users/abitsoylu/eclipse-workspace/JavaBasic7Abit/configs/home.txt";
		
		//this way only i will be run it from my mac, har coding in not good practice
		
		//we need to use dynamic location
		
		String projectPath = System.getProperty("user.dir"); // fidning my main folder 
		
		System.out.println(projectPath);
		
		String filePath = projectPath + "/configs/homework.txt"; // now everyone can work on my file
		
		System.out.println(filePath);
		
		System.out.println();
		
		// creating file input stream , which is reading to file 
		
		FileInputStream fis = new FileInputStream(filePath);
		
		
		
		// loading date from the stream
		Properties props = new Properties();
		
		props.load(fis); //loding chanel to file fis 
		
		// what do i have in my property file
		
		System.out.println(props); //reading the file 
		
		// let gets the value of browser (key)
		
		String browser = props.getProperty("browser");
		
		System.out.println("Browser is --> " + browser);
		
		// lets get the key set
		
		Set<Object> keys = props.keySet();
		
		for(Object key:keys)
		{
			System.out.println(key + " ---> " + props.get(key));
		}
		
		
		System.out.println("---- Selenium Steps -----");
		System.out.println("I am opening a browser: " + props.getProperty("browser"));
		System.out.println("I navigate to this url: " + props.getProperty("url"));
		System.out.println("I will enter username: " + props.getProperty("username"));
		System.out.println("I will enter password: " + props.getProperty("password"));

		// how do we add a new key value pair(property) to the file
		// lets create our new property
		props.setProperty("phone_number", "555 345 5554");

		// we need FileOutputStream to write to the file
		FileOutputStream fos = new FileOutputStream(filePath);

		// store the new property into the file
		props.store(fos, "Added phone property");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
