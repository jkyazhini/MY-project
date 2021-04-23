package com.yazhini;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class BookingDate {
	public static void Date(double Total, int NoOfKm) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Coming Date [YYYY-MM-DD]  :");
		String date = sc.next();
		LocalDate JourneyDate = LocalDate.parse(date); //string value is converted by integer value
		LocalDate currentDate = LocalDate.now();     //current date is get
		if (JourneyDate.isBefore(currentDate)) {     //compare the date is before or not
			System.out.println("Enter the Valid Date :");
			Date(Total, NoOfKm); //using the recursive function
		}
		if ((JourneyDate.isAfter(currentDate)) || (JourneyDate.equals(currentDate))) {  //compare the date is after or not
			BookingTime.Time(JourneyDate, currentDate, Total, NoOfKm);
		}

	}

}
