package java_string_problems;

import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		String s;
		char c, d;
		int len, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		s = sc.nextLine();
		System.out.println("Enter the character to check the frequency for :");
		c = sc.next().charAt(0);

		// Character is a predefined wrapper class to manipulate characters.
		c = Character.toLowerCase(c);

		// Converting to upperCase using ASCII values
		d = (char) (c - 32);
		len = s.length();
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == c || s.charAt(i) == d) {
				++count;
			}
		}
		System.out.println(" Result : " + count);

		sc.close();
	}

}
