package com.assignment_4;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string :");
		String name = scan.next();
		int i, j;
		int len = name.length();
		int rev = len;
		char[] namee = name.toCharArray();
		for (i = 0; i < len / 2; i++, rev--) {
			if (namee[i] == namee[rev]) {

				System.out.println("s");
				continue;
			} else {
				System.out.println("no");
			}
		}

	}

}
