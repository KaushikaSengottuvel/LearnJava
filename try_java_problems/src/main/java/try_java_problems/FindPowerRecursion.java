package try_java_problems;

import java.util.Scanner;

public class FindPowerRecursion {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base :");
		a = sc.nextInt();
		System.out.println("Enter the power :");
		b = sc.nextInt();
		System.out.println("Result :" + findPower(a, b));
		sc.close();

	}

	private static int findPower(int a, int b) {
		if (b == 1)
			return a;
		else
			return a * findPower(a, b - 1);
		/*
		 * a=2,b=3; 1.return a* findPower(2,2); checks condition and enters to else part
		 * 2.return a*findPower(2,1); now b=1, so it returns 2. so 2.a*2 (i.e)4 and its
		 * returned to 1. (i.e)a*4 result=8
		 */

	}

}
