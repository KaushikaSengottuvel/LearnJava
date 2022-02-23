package java_string_problems;

import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		String s;
		char c;
		int len, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		s = sc.nextLine();
		System.out.println("Enter the character to check the frequency for :");
		c = sc.next().charAt(0);
		len = s.length();
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == c) {
				++count;
			}
		}
		System.out.println(" Result : " + count);

		sc.close();
	}

}
