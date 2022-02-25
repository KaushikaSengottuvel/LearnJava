package java_string_problems;

import java.util.Scanner;

public class CountVowelConsonant {

	public static void main(String[] args) {
		int len, vow = 0, con = 0, space = 0, dig = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence :");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		len = sb.length();

		for (int i = 0; i < len; i++) {
			if (sb.charAt(i) == 'a' || sb.charAt(i) == 'A' || sb.charAt(i) == 'e' || sb.charAt(i) == 'E'
					|| sb.charAt(i) == 'i' || sb.charAt(i) == 'I' || sb.charAt(i) == 'o' || sb.charAt(i) == 'O'
					|| sb.charAt(i) == 'u' || sb.charAt(i) == 'U') {
				vow++;
			} else if (sb.charAt(i) > 'a' && sb.charAt(i) <= 'z' || sb.charAt(i) > 'A' && sb.charAt(i) <= 'Z') {
				con++;
			} else if (sb.charAt(i) == ' ') {
				space++;
			} else if (sb.charAt(i) >= '0' && sb.charAt(i) <= '9') {
				dig++;
			}
		}
		System.out.println("Vowels Count :" + vow + "\nConsonants Count :" + con + "\nSpace Count :" + space
				+ "\nDigits Count :" + dig);
		sc.close();
	}

}
