package basic_java_problems;

import java.util.Scanner;

public class SumOfNaturalNo {

	public static void main(String[] args) {
		int numm, sum = 0;
		Scanner sc = new Scanner(System.in);
		numm = sc.nextInt();

		for (int i = 0; i <= numm; i++) {
			sum += i;
		}

		System.out.println("Sum : " + sum);
	}

}
