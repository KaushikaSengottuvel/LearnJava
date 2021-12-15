package try_java_problems;

import java.util.Scanner;

public class print_ascii_value {

	public static void main(String[] args) {
		char a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character:");
		a = sc.next().charAt(0);
		b = a;
		System.out.println("Ascii value of the character " + a + " : " + b);

	}

}
