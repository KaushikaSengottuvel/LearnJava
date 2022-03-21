package java_string_problems;

import java.util.Scanner;

public class CharToString {

	public static void main(String[] args) {
		char c;
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character to convert into String :");
		c = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Enter the String to convert into Character Array :");
		s = sc.nextLine();
		System.out.println("String converted to Char Array :");
		// String.toCharArray()
		char cArray[] = s.toCharArray();
		for (char ch : cArray)
			System.out.print(ch + " ,");

		// Character.tostring(char)
		System.out.println("\nCharacter converted to String : " + Character.toString(c));
		sc.close();
	}

}
