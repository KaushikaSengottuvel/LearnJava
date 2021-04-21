package com.assignment_2;

public class StraightPrintDaphne {

	public void printname(String name) {

		int namelength = name.length();

		for (int i = 0; i < namelength; i++) {
			System.out.println(name.charAt(i));

		}
	}

	public static void main(String[] args) {

		StraightPrintDaphne printdaphne = new StraightPrintDaphne();
		printdaphne.printname("Daphne");

	}

}
