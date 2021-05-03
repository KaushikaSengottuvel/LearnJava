package com.assignment_3;

import java.util.Scanner;

public class OccurrenceOfCharacter {

	public void findOccurrenceOfCharacter(String name) {
		int i, j;
		String n = "";
		for (i = 0; i < name.length(); i++) {

			int count = 0;
			for (j = 0; j < name.length(); j++) {

				if (name.charAt(i) == name.charAt(j)) {
					count++;

				}
			}

			System.out.println(name.charAt(i) + " - " + count);

		}
	}

	public static void main(String[] args) {
		OccurrenceOfCharacter object = new OccurrenceOfCharacter();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String name = scan.next();
		object.findOccurrenceOfCharacter(name);
		scan.close();

	}

}
