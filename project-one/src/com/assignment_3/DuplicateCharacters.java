package com.assignment_3;

import java.util.Scanner;

public class DuplicateCharacters {
	public void findDuplicateCharacters(String name) {
		String new1 = "";
		int k = 0;
		for (int i = 0; i < name.length() - 1; i++) {
			for (int j = i + 1; j < name.length(); j++) {
				if (name.charAt(i) == name.charAt(j)) {
					if (!new1.contains(String.valueOf(name.charAt(i)))) {
						new1 += name.charAt(i);
					}

				}
			}

		}
		System.out.println(new1);
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
