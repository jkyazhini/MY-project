package com.yazhini;

import java.util.Scanner;

public class PriceEstimator {
	public static void paybill() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the CabType :");   
		int cabtype = sc.nextInt();
		System.out.println("Enter the NoOfKm :");
		int NoOfKm = sc.nextInt();
		if(NoOfKm>0)
		{
		switch (cabtype) {
		case 1: {                     /**use the swith case function 
		                                 then calculate the killometres**/
			MICRO(NoOfKm);
		}
		case 2: {
			MINI(NoOfKm);
		}
		case 3: {
			PRIME(NoOfKm);
		}
		default: {
			System.out.println("Please enter the valid CABTYPE in the above details :");
			break;
		}
		}
		}
			else{
				System.out.println("Enter the valid killometres(above 1)");
			}

	}

	public static void MICRO(int A) {                          
		double amount = (double) (A * 350);  //gst value is calculated in normal amount
		System.out.println("Total amount of MICRO = " + amount);
		GST.calc1(amount, A);
	}

	public static void MINI(int B) {
		double amount = (double) (B * 250);
		System.out.println("Total amount of MINI = " + amount);
		GST.calc1(amount, B);

	}

	public static void PRIME(int C) {
		double amount = (double) (C * 100);
		System.out.println("Total amount of PRIME = " + amount);
		GST.calc1(amount, C);
	}
}
