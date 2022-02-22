package basic_java_problems;

import java.util.Scanner;

public class NaturalNoSumUsingRec {
	int sum = 0;

	public int findSum(int a) {

		if (a > 1) {
			sum = a + findSum(a - 1);
		} else
			return a;
		return sum;
	}

	public static void main(String[] args) {
		int a, sum;
		NaturalNoSumUsingRec obj = new NaturalNoSumUsingRec();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		a = sc.nextInt();
		System.out.println("Sum of " + a + " natural numbers are " + obj.findSum(a));
	}

}
