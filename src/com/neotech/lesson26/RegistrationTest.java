package com.neotech.lesson26;

public class RegistrationTest {

	public static void main(String[] args) {

		Registration r1 = new Registration();

		Registration r2 = new Registration();

		r1.setEmail("abitsoylu@me.com");

		r1.setUserName("soylu");

		//r1.setPassword("cery");

		System.out.println("----------");

		// setting email, userName and password based on requirements

		r2.setEmail("abitsoylu@yahoo.com");
		r2.setUserName("ceryanli");
		r2.setPassword("test12345");

		System.out.println(r2.getEmail());
		System.out.println(r2.getUserName());
		System.out.println(r2.getPassword());

	}

}
