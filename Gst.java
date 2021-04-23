package com.yazhini;

public class GST {
	public static void calc1(double amount, int NoOfKm) {
		double GST = (double) 7 * (amount / 100);              /** normal amount with gst then add to the 
		                                                              total price amount of the bill   **/
		double Total = GST + amount;
		System.out.println("~~~~~~~~~~~~~~TOTAL AMOUNT~~~~~~~~~~~~~~");
		System.out.println("PRICE AMOUNT =" + amount);
		System.out.println("GST AMOUNT   =" + GST);
		System.out.println("TOTAL AMOUNT=" + Total);

		BookingDate.Date(Total, NoOfKm);

	}
}
