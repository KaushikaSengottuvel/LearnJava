package java_string_problems;

import java.util.Scanner;

public class CheckEmpty {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		s = sc.nextLine();
		if (s.isEmpty())
			System.out.println("String is Empty(Using isEmpty())");
		else
			System.out.println("String is Not Empty");
		System.out.println("Checking Without predefined function :");

		if (s == null)
			System.out.println("String -  Null");
		else
			System.out.println("String - Not Null");

		sc.close();
	}

}
