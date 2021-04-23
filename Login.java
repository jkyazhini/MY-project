package com.yazhini;

import java.util.Scanner;

public class login {

	public static void main(String[] args) throws Exception {

		MobileNo();	
	}

	public static void MobileNo() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the MobileNumber: "); //Enter a 10 Digit numer
		Long MobileNo = sc.nextLong();
		String MobileNoString = String.valueOf(MobileNo);
		if (MobileNoString.length() == 10) {    /**check the mobile no is valid or not.
		                                        and check the 10 digit number**/ 
			System.out.println("Verified Successfully");

			{
				password();                       //its verification is success then move to next function 
			}
		} else if (MobileNoString.length() != 10) {  //if mobile no is invalid
			System.out.println("your mobile no is wrong.(please Enter Valid mobileno) :");
		}

		MobileNo();                          //check the invalid mobileno then move to mobileno();
	}

	public static void password() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Password (eight char must) :"); //pasword must be access in 8 characters only
		String name = sc.next();
		String nameString = String.valueOf(name);

		if (name.length() == 8) {
			System.out.println("Login Successfully");  //if length is 8,then login is succeed
			CabType.CAB();        //move to another function

		} else {
			System.out.println("Login Unsuccessfully");  //if length is not 8,then login is not succeed
			password();
		}

	}

}
