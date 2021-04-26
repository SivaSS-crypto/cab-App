package com.siva;
public class PeakHour {
	public static void peakHour( int hour, float price) {
		//Checking the PeakHour Times
		 if(hour>=17&& hour<20) {
			price += price * 0.0125; //Calculating Price in PeakHour
			System.out.println("You are Traveling in a PeakHour");
			System.out.println("The Price at PeakHour is, Rs:" + price);}
		
		

}}
