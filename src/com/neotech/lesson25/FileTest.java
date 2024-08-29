package com.neotech.lesson25;

public class FileTest {
	
	public static void main(String[] args) {

		// File file = new File(); uncomplete class

		File java = new JavaFile();
		
		
		File pdf = new PdfFile();


		File[] files = { java, pdf };
		


		// 2nd way
		File[] files2 = { new JavaFile(), new PdfFile(), new WordFile() };

		for (File file : files2) {
			file.open();
			System.out.println();
			file.edit();
			System.out.println();
			file.close();
		}


	}

}
