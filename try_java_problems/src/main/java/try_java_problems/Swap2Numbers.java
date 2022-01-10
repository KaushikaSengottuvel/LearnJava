package try_java_problems;

import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number a :");
		a = sc.nextInt();
		System.out.println("Enter Number b :");
		b = sc.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println("Swapped numbers  : a = " + a + " and b = " + b);
		sc.close();
	}

}
