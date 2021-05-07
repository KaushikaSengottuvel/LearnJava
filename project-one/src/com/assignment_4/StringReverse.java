package com.assignment_4;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string :");
		String name = scan.next();
		StringBuilder stringbuilder = new StringBuilder(name);

		System.out.println("Reversed String : " + stringbuilder.reverse());

		scan.close();
	}

}
