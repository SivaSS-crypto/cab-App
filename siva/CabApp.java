package com.siva;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class CabApp {
	public static void main(String args[])
	

	{
	
		Scanner ob = new Scanner(System.in);
		
		if (Loginvalidation.loginValidate()) {
			// Goes to next step for Booking
			
			System.out.println("Your Login Success");

			CabType.cabType();// Shows the Types of Cabs
			
			int dist = Distance.distance(); // Get the Traveling Distance
			
			String cabs = Distance.cabTypes(); // Select the CabType
			
			int rs = PriceCalculate.cabPrice(cabs, dist);// Calculating the Price for Selected CabType

			float gst = GSTPrice.GstAmount(rs); // Calculating GST Price
			
			System.out.println("Enter DOB(Year-mm--dd)");
			
			String dobStr = ob.next(); // Getting Date of Birth From User

			int age = CalculateAge.ageCalculation(dobStr); // Calculating Age

			System.out.println("Your Ride Price is : " + "Rs " + rs);
			
			System.out.println("GST :" + gst);
			
			float total = gst + rs;// Total Amount with GST

			System.out.println("Total Price is :" + total);

			LocalTime time = LocalTime.now(); // Getting Current time

			// LocalDate Date = LocalDate.now();// Today's Date

			int hour = time.getHour(); // Getting Hour from Time

			// Checking for PeakHour
			PeakHour.peakHour(hour, total);// PeakHour Price calculation

			// Checking For Senior Citizen

			SeniorCitizen.forSeniorCitizen(age, total);// Discount for SeniorCitizen

			System.out.println("!!Have a Nice Journey !!");

		}
		
		else
		// If Validation is False
		{
			String[] arg = null;
			System.out.println("Invalid Credentials!! Please Enter your valid details!");
			main(arg);
		}
		ob.close();
	}



}
