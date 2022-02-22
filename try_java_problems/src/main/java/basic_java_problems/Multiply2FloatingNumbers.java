package basic_java_problems;

import java.util.Scanner;

public class Multiply2FloatingNumbers {

	public static void main(String[] args) {
		float a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter float value 1 :");
		a = sc.nextFloat();
		System.out.println("Enter float value 2 :");
		b = sc.nextFloat();
		System.out.println("Sum of 2 integers : " + a * b);
		sc.close();
	}

}
