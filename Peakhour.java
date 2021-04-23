package com.yazhini;

import java.time.LocalTime;

public class PEAKHOURS {
	public static void PeakhourValidate(LocalTime JourneyTime, double Total, int NoOfKm) {
		int peakhour = JourneyTime.getHour();    //if journey time throught get the hour only
		System.out.println("hour :" + peakhour);  //print the peakhour
		if (peakhour >= 17 && peakhour <= 19) {    //declare to the peakhour is 17-19 
			System.out.println("This is a Peakhours (so you can pay in extra amount) :");

			float price = (float) ((1.25 / 100) * NoOfKm);  // this is a math function for peakhour calculation
			float TotalAmount = (float) (price + Total);
			System.out.println("your Peakhours Amount is : " + price);

			System.out.println(" Your Total Amount is (After peahours)  :" + TotalAmount);

			SeniorCitizen.FindCitizen(TotalAmount); 

		} else
			SeniorCitizen.FindCitizen(Total);
	}
}
