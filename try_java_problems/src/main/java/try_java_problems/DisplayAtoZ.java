package try_java_problems;

import java.util.Scanner;

public class DisplayAtoZ {

	public static void main(String[] args) {
		char a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet :");
		// a = sc.next().charAt(0);
		/*
		 * while (a != 'z' && a != 'Z') { System.out.println(a + " "); a++; }
		 * System.out.println(a);
		 */
		for (a = sc.next().charAt(0); a <= 'Z' || a <= 'z'; a++) {
			System.out.println(a);
		}
	}

}
