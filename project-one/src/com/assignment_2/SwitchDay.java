package com.assignment_2;

import java.util.Scanner;

public class SwitchDay {

	public void findDay(int day) {
		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Wrong Number3");

		}

	}

	public static void main(String[] args) {

		SwitchDay switchDay = new SwitchDay();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int day = scan.nextInt();
		switchDay.findDay(day);
		scan.close();
	}

}
