package com.siva;
import java.util.Scanner;

public class Distance {

	public static int distance() {
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter the km");
		int k = ob.nextInt(); //Getting the Distance from the User
		
		return k;

	}
	public static String cabTypes() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Cab you want:");
		String s = sc.nextLine();
		//Selecting the cab type for travel
	
				
		
	if(s.equalsIgnoreCase("Micro") || s.equalsIgnoreCase("Mini")||s.equalsIgnoreCase("Prime")) {
	
		}
		else
		{
			System.out.println("Enter a Valid Cab");
			CabType.cabType();
			 s  =cabTypes();
			
		}
		return s;
	}

}
