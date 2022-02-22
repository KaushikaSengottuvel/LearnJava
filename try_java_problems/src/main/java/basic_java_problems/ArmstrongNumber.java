package basic_java_problems;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a, temp, num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		a = sc.nextInt();
		int original = a;
		while (a > 0) {
			temp = a % 10;
			a = a / 10;
			num += temp * temp * temp;
		}

		if (original == num)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an armstrong number");
		sc.close();
	}

}
