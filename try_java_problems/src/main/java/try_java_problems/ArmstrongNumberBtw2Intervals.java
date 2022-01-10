package try_java_problems;

import java.util.Scanner;

public class ArmstrongNumberBtw2Intervals {

	public static void main(String[] args) {
		int a, b, original, temp, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range from:");
		original = sc.nextInt();
		System.out.println("Till :");
		b = sc.nextInt();
		sc.close();
		for (; original <= b; original++) {
			a = original;
			num = 0;
			while (a > 0) {
				temp = a % 10;
				a = a / 10;
				num += temp * temp * temp;
			}
			if (original == num)
				System.out.println(num);
		}

	}

}
