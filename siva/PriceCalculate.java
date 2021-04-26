package com.siva;
public class PriceCalculate {

	public static int cabPrice(String cab, int k) {
		int rs = 0;
		if (cab.equalsIgnoreCase("Micro")) {
			rs = k * 10;

		}
		if (cab.equalsIgnoreCase("Mini")) {
			rs = k * 20;

		}
		if (cab.equalsIgnoreCase("Prime")) {
			rs = k * 30;
		}
		
		return rs;
	}

	}

