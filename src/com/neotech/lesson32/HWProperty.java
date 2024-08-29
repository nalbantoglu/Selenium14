package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class HWProperty {

	public static void main(String[] args) throws IOException {
		
		
		/*
		 * 	 * Homework 1:
    
    Create a PROPERTY file to store following configurations:
        browser=
        url=
        username=
        password=
		 */
		
		// 1 find where the file is located 
		
		String filelocation = "/Users/abitsoylu/eclipse-workspace/JavaBasic7Abit/configs/homework.properties";
		
		// 2 -- reading or writing ---fileInputStream
		
		FileInputStream  fis = new FileInputStream(filelocation);
		
		//these next steps are specific to .properties file type
		
		//3. create a properties object
		
		Properties prop = new Properties();
		

		//4. load the data in the properties object
		prop.load(fis);
		
		//lets change some data
		
		prop.setProperty("browser", "safari");
		prop.setProperty("url", "https://classroom.google.com/");
		prop.setProperty("username", "abitsoylu");
		prop.setProperty("password", "1234");
		
		
		//to write these into the file I need a FileOutputStream
		
		FileOutputStream fos = new FileOutputStream(filelocation);
				
		//writes the changes to the file
		prop.store(fos, "added new information");
		
		
		
		
		
		
		
		
		

	}

}
