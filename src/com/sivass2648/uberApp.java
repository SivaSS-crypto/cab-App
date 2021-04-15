package com.sivass2648;




import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.util.Scanner;

public class uberApp {
	public static int ageCalc() {
		System.out.println("Enter DOB");
		Scanner ob = new Scanner(System.in);
		String dobStr = ob.next();
		LocalDate d1 = LocalDate.parse(dobStr);
		LocalDate now = LocalDate.now();
		int dd1 = d1.getYear();
		int gg1 = now.getYear();
		int age = gg1 - dd1;
		System.out.println("Your age is:" + age);
		return age;
	}

	public static void cabType() {
		String[] cabTypes = new String[3];
		System.out.println("Cab Types:");
		cabTypes[0] = "Micro";
		cabTypes[1] = "Macro";
		cabTypes[2] = "Prime";
		for (int i = 0; i < cabTypes.length; i++) {
			String cType = cabTypes[i];
			System.out.println(cType);
		}
	}

	public static int cabPrice(String cab, int k) {
		int rs = 0;
		if (cab.equalsIgnoreCase("Micro")) {
			rs = k * 10;

		}
		if (cab.equalsIgnoreCase("Macro")) {
			rs = k * 20;

		}
		if (cab.equalsIgnoreCase("Prime")) {
			rs = k * 30;
		}
		return rs;
	}

	public static void main(String args[])

	{
		Scanner ob = new Scanner(System.in);
		int k = 0, rs = 0;
		double gst = 0;
		System.out.print("Enter the MobileNumber:");
		String mobileNo = ob.next();
		System.out.print("Enter the password:");
		String passWord = ob.next();

		if (mobileNo.equals("9361363167") && passWord.equals("1234siva")) {
			System.out.println("Your Login Success");

			cabType();
		
		// for(String c:cabTypes)
		// {
		// System.out.println(c);

		// }
		System.out.println("Enter the km");
		k = ob.nextInt();
		System.out.println("Enter the Cab you want:");
		String cab = ob.next();

		rs = cabPrice(cab, k);
		System.out.println("Total Bill Amouunt is" + rs);

		gst = rs * 0.07;
		float total = (float) gst + rs;
		System.out.println("GST:" + gst);
		System.out.println("Total Bill:" + total);

		LocalDate now = LocalDate.now();// Journey Date
		LocalTime time = LocalTime.now();// Journey Time
		LocalDateTime timestamp = LocalDateTime.now();// Booking Date and Time
		System.out.println("Date of Journey:" + now);
		System.out.println("Pickup Time:" + time);
		int age = ageCalc();
		LocalTime cabPickupTime = LocalTime.parse("16:00");
		int hour = cabPickupTime.getHour();
		System.out.println("Hour:" + hour);
		if (age > 60) {
			float amountNew = total / 2;
			System.out.println("AMount after Discount:" + amountNew);
		}
		if (hour >= 16 && hour <= 19) {
			System.out.println("Peak Hours");
			double amountPeak = (float) total * 1.25;
			System.out.println("The TOTAL AMOUNT in Peak hour is" + amountPeak);

			if (age > 60) {
				double newAmount = amountPeak / 2;
				System.out.println("Amount with discount is:" + newAmount);
			}
		}
		}
		/*
		 * int dob=Integer.parseInt(dobStr); LocalDate dobObject=LocalDate.now();
		 * System.out.println("DOB String:"+ dobStr);
		 * System.out.println("DOB Object:"+dobObject);
		 * 
		 *///Card - expiry Date(Optional)
	/*	Year dobYear=Year.of(2000);
		MonthDay monthDay=MonthDay.parse("11-05");
		YearMonth cardExpiryDate=YearMonth.parse("2021-05");
		if(cardExpiryDate.isBefore(YearMonth.now())
				) {
			System.out.println("card Expired");
			
		}
		else
		{
			System.out.println("Card is Valid");
		}*/
		else 
		{
			System.out.println("Wrong password or MobileNumber! Try Again!!");

		}
		ob.close();
	}}




