package java_string_problems;

import java.util.Scanner;

public class SortInLexicographicalOrder {

	public static void main(String[] args) {
		int n;
		String temp;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of words to be sorted :");
		n = sc.nextInt();

		// Declaring string array with size 'n'
		String s[] = new String[n];

		System.out.println("Enter the Strings now :");
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextLine();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (s[i].charAt(0) < s[j].charAt(0)) {
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}

		System.out.println("Strings after sorting :");

		// enhanced for loop
		for (String a : s) {
			System.out.println(a);
		}
		sc.close();
	}

}
