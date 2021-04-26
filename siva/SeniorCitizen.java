package com.siva;

public class SeniorCitizen {
	public static void forSeniorCitizen(int age,float total)
	{
		if (age > 60) {
			// Checking For Senior Citizen
			total = total / 2; //Discount amount for SeniorCitizen
			System.out.println(" You are a SeniorCitizen You have Discount of 50% ");
			System.out.println("Your Travel Charge is Rs." + total);
		}
		
	}

}
