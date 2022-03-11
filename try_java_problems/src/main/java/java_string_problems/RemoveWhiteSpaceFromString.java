package java_string_problems;

import java.util.Scanner;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		s = sc.nextLine();
		// We've used regular expression \\s that finds all white space characters
		// (tabs, spaces, new line character, etc.) in the string. Then, we replace it
		// with "" (empty string literal).
		System.out.println(s.replaceAll("\\s", ""));
		sc.close();
	}

}
