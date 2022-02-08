package online_fastfood_ordering_project;

import java.util.Scanner;

public class GenerateBill {
	int myAmount;
	Scanner sc = new Scanner(System.in);

	public void generateBill(int sum) {
		System.out.println("Your Total Bill : " + sum);
		do {
			System.out.println("Enter the amount you pay :");
			myAmount = sc.nextInt();
			if (myAmount > sum)
				System.out.println("Please have your balance amount : " + (myAmount - sum));
			else
				System.out.println("You have Insufficient Amount. Please check it out!");
		} while (myAmount < sum);
		System.out.println("Thank you for choosing Us! Please visit Again!!");
	}
}
