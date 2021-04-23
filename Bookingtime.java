package com.yazhini;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class BookingTime {
	public static void Time(LocalDate JourneyDate, LocalDate CurrentDate, double Total, int NoOfKm) {

		Scanner sc = new Scanner(System.in);
		System.out.println("!!!! You can book the CAB Anytime !!!! ");  
		System.out.println("please enter the time [HH:MM:SS]  :");
		String time = sc.next();
		LocalTime JourneyTime = LocalTime.parse(time);   //time is convert to integer  
		LocalTime currentTime = LocalTime.now();      //get the current time

		if (JourneyDate == CurrentDate) {
			if (JourneyTime.isBefore(currentTime)) {   //if the time is before then you have to enter the valid time 
				System.out.println("Enter the Valid time :");   
				Time(JourneyDate, CurrentDate, Total, NoOfKm);  //using the recursive function
			}
			if (JourneyTime.isAfter(currentTime)) {    
				PEAKHOURS.PeakhourValidate(JourneyTime, Total, NoOfKm);
			}
			if (JourneyTime == currentTime) {

				System.out.println("please wait a minutes  :");
			}
		}
		PEAKHOURS.PeakhourValidate(JourneyTime, Total, NoOfKm);
	}
}
