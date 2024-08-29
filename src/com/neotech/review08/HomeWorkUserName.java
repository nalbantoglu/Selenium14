package com.neotech.review08;

import java.util.Scanner;

public class HomeWorkUserName {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String userName ;
		int pass ;

		int num = 0;

		while (num <2) {
			System.out.println("enter your user name");
			userName = scan.next();

			System.out.println("enter your password");
			pass = scan.nextInt();

			if (userName.equals("user") && pass == 1234)

			{
				System.out.println("welcome back.");
				num++;
				break;

			}

			else {
				System.out.println("wrong user name or password. try again ");
			}

			// scan= next.close;

			System.out.println(" ");

		}

	}

}
