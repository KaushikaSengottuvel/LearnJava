package com.assignment_4;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string :");
		String name = scan.next();
		StringBuilder sb = new StringBuilder(name);
		/*
		 * int i, j; int len = name.length(); int rev = len; char[] namee =
		 * name.toCharArray(); for (i = 0; i < len / 2; i++, rev--) { if (namee[i] ==
		 * namee[rev]) {
		 *
		 * System.out.println("s");
		 *
		 * } else { System.out.println("no"); } }
		 */
		String revname = sb.reverse().toString();
		System.out.println(name + revname);
		if (name.equals(revname)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");

		}

	}

}
