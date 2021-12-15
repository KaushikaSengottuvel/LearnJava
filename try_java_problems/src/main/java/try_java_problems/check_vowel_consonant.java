package try_java_problems;

import java.util.Scanner;

public class check_vowel_consonant {

	public static void main(String[] args) {
		String a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character to check Vowel or Consonant :");
		a = sc.nextLine();
		if (a.length() > 1) {
			System.out.println("Its not a character");
		} else if (a.equalsIgnoreCase("a") || a.equalsIgnoreCase("e") || a.equalsIgnoreCase("i")
				|| a.equalsIgnoreCase("o") || a.equalsIgnoreCase("u")) {
			System.out.println("Its a Vowel");
		} else
			System.out.println("Its a Consonant");
		sc.close();
	}
}
