package com.assignment_3;

import java.util.Scanner;

public class OccurrenceOfCharacter {

	public void findOccurrenceOfCharacter(String name) {
		int i, j;
		for (i = 0; i < name.length() - 1; i++) {
			// for()
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
