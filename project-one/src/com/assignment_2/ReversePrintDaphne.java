package com.assignment_2;

public class ReversePrintDaphne {
	int i;

	public void printname(String name) {
		int len = name.length();

		for (i = len - 1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}

	}

	public static void main(String[] args) {
		ReversePrintDaphne reverse = new ReversePrintDaphne();
		reverse.printname("Daphne");

	}

}
