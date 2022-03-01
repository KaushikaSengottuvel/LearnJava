package java_string_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortInLexicographicalOrderWithList {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of words to be sorted :");
		n = sc.nextInt();

		// Store 'N' number of strings using List
		List<StringBuilder> lis = new ArrayList<>();
		// 'lis' is the name of the list created of type StringBuilder.

		System.out.println("Enter the Strings now :");
		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder(sc.nextLine());
			lis.add(sb);
		}

		// sort usind predefined function 'sort' from 'Collections'
		Collections.sort(lis);

		System.out.println("\n4Strings after Sorting in Alphabetical Order :");
		for (StringBuilder a : lis) {
			System.out.println(a);
		}

		sc.close();
	}

}
