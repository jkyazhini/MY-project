package com.yazhini;

import java.time.LocalDate;
import java.util.Scanner;

public class SeniorCitizen {
	public static void FindCitizen(double Total) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your DOB [YYYY-MM-DD]:");
		String DOB = sc.next();
		LocalDate DOBString = LocalDate.parse(DOB);  ///string to integer coversion
		LocalDate currentDate = LocalDate.now();
		int Type1 = DOBString.getYear();  //get in dob year
		int Type2 = currentDate.getYear();  //get in current year
		int age = (Type2 - Type1);     //sub in current year to dob year
		if (age > 60) {
			float Type3 = (float) (Total / 100) * 50;   //if the year is above 60 then discount in 50% of total amount
			System.out.println("You are a SENIOR CITIZEN. your TotalBillAmount is :" + Type3);

		} else
			System.out.println("You are not a SENIOR CITIZEN. your TotalBillAmount is :" + Total);

	}

}
