package com.siva;
public class CabType {

	public static void cabType() {
		System.out.println("Vishvajith Cabs");
		String[] cabTypes = new String[3];
		System.out.println("Cab Types:");
		cabTypes[0] = "Micro(Rs.10/km)";
		cabTypes[1] = "Mini(Rs.20/km)";
		cabTypes[2] = "Prime(Rs.30/km)";
		for (int i = 0; i < cabTypes.length; i++) {
			String cType = cabTypes[i];
			System.out.println(cType);
		}
	}

}
