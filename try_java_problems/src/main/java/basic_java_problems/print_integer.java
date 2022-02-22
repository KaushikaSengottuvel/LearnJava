package basic_java_problems;

import java.util.Scanner;

public class print_integer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		System.out.println("You have entered : " + a);
		sc.close();
	}

}
