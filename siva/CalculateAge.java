package com.siva;
import java.time.LocalDate;


public class CalculateAge {
	public static int ageCalculation(String dobStr) {
		//System.out.println("Enter DOB");
		//Scanner ob = new Scanner(System.in);
		//String dobStr = ob.next();
		LocalDate d1 = LocalDate.parse(dobStr);
		LocalDate now = LocalDate.now();
		int dd1 = d1.getYear();
		int gg1 = now.getYear();
		int age = gg1 - dd1;
		System.out.println("Your age is:" + age);
		return age;
		
	}

}
