package com.siva;
import java.util.Scanner;

public class Loginvalidation {
public static boolean loginValidate()
{
	Scanner ob = new Scanner(System.in); // Scanner Implementation
	
	System.out.print("Enter the MobileNumber:");
	
	String mobileNo = ob.next();
	
	System.out.print("Enter the password:");
	
	String passWord = ob.next();
	
	boolean toCheck = check(mobileNo, passWord);// Validate MobileNumber and Password
	return toCheck;

}
public static boolean check(String mobileNo, String passWord) {
	// if password matches login, or return false.
	if (passWord.equals("1234siva") && mobileNo.equals("9361363167")) {
		return true;
	}

	return false;
}

}
