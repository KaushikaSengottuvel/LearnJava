package try_java_problems;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String s;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		s = sc.nextLine();
		int len = s.length();
		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) == s.charAt(len - i - 1)) {
				count = 1;
			} else {
				count = 0;
				break;

			}
		}
		if (count == 1)
			System.out.println("Palindrome");
		else
			System.out.println("Nope");

	}

}
