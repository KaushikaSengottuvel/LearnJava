package com.assignment_3;

import java.util.Scanner;

public class DuplicateCharacters {
	public void findDuplicateCharacters(String name) {

		for (int i = 0; i < name.length(); i++) {
			for (int j = i + 1; j < name.length(); j++) {
				if (name.charAt(i) == name.charAt(j)) {
					System.out.print(name.charAt(i) + " ");
				}
			}

		}

	}

	public static void main(String[] args) {
		DuplicateCharacters obj = new DuplicateCharacters();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String name = scan.next();
		obj.findDuplicateCharacters(name);
		scan.close();
	}

}
