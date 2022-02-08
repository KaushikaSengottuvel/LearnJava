package online_fastfood_ordering_project;

import java.util.Scanner;

public class FoodOrder {
	GenerateBill billObj = new GenerateBill();
	Scanner sc = new Scanner(System.in);

	public void foodOrder() {
		int main, quan, opt, myAmount, sum = 0;
		char sub;
		do {
			System.out.println("Please select the main Menu Number to order(1,2,3, or 4).");
			main = sc.nextInt();
			switch (main) {
			case 1:
				System.out.println("Please select the Burger submenu a,b or c");
				sub = sc.next().charAt(0);
				System.out.println("Please mention the quantity");
				quan = sc.nextInt();
				switch (sub) {
				case 'a':
					sum += 90 * quan;
					break;
				case 'b':
					sum += 60 * quan;
					break;
				case 'c':
					sum += 65 * quan;
					break;
				default:
					System.out.println("Invalid Option.");
					break;
				}
				break;
			case 2:
				System.out.println("Please select the Pizza submenu a,b or c");
				sub = sc.next().charAt(0);
				System.out.println("Please mention the quantity");
				quan = sc.nextInt();
				switch (sub) {
				case 'a':
					sum += 110 * quan;
					break;
				case 'b':
					sum += 90 * quan;
					break;
				case 'c':
					sum += 95 * quan;
					break;
				default:
					System.out.println("Invalid Option.");
					break;
				}
				break;
			case 3:
				System.out.println("Please select the Chicken submenu a,b,c or d");
				sub = sc.next().charAt(0);
				System.out.println("Please mention the quantity");
				quan = sc.nextInt();
				switch (sub) {
				case 'a':
					sum += 90 * quan;
					break;
				case 'b':
					sum += 75 * quan;
					break;
				case 'c':
					sum += 150 * quan;
					break;
				case 'd':
					sum += 290 * quan;
					break;
				default:
					System.out.println("Invalid Option.");
					break;
				}
				break;

			case 4:
				System.out.println("Please select the Drinks submenu a,b,c or d");
				sub = sc.next().charAt(0);
				System.out.println("Please mention the quantity");
				quan = sc.nextInt();
				switch (sub) {
				case 'a':
					sum += 10 * quan;
					break;
				case 'b':
					sum += 20 * quan;
					break;
				case 'c':
					sum += 65 * quan;
					break;
				case 'd':
					sum += 35 * quan;
					break;
				default:
					System.out.println("Invalid Option.");
					break;
				}
				break;
			default:
				System.out.println("Invalid Option.");
				break;
			}
			System.out.println("Do you want to order more? 1.Yes 2.No");
			opt = sc.nextInt();
		} while (opt == 1);
		billObj.generateBill(sum);
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
