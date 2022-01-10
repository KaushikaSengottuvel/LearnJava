package try_java_problems;

import java.util.Scanner;

public class CountNoOfDigits {

	public static void main(String[] args) {
		int a, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer :");
		a = sc.nextInt();
		while (a > 0) {
			a = a / 10;
			count++;
		}
		System.out.println(count);
		sc.close();

	}

}
