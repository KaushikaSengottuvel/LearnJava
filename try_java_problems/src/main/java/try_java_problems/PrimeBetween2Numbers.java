package try_java_problems;

import java.util.Scanner;

public class PrimeBetween2Numbers {

	public static void main(String[] args) {
		int x, y, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number : ");
		y = sc.nextInt();
		System.out.println("Enter Ending number : ");
		x = sc.nextInt();
		for (int i = y; i < x; i++) {
			if (x % i == 0) {
				count = 1;
				break;
			} else
				System.out.println(i);
		}

	}

}
