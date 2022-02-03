package online_fastfood_ordering_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProblemMain {

	int user;
	Customer customer = new Customer();
	Scanner sc = new Scanner(System.in);
	List<Customer> customerList = new ArrayList();

	public static void main(String[] args) {

		ProblemMain mainObj = new ProblemMain();
		mainObj.init();
	}

	public void init() {
		do {
			System.out.println("Welcome to Cheesy Queen!! \n 1.Register 2.Sign in 3.Exit");
			user = sc.nextInt();
			switch (user) {
			case 1: {
				register();
				break;
			}
			case 2: {
				signin();
				user = 3;
				break;
			}
			case 3: {
				System.out.println("****Thank you for visiting us! Have a Nice Day!!****");
				break;
			}
			default:
				System.out.println("Invalid Option.");
			}

		} while (user != 3);
	}

	public void register() {
		System.out.println("Registration Details \n Enter your name :");
		String name = sc.nextLine();
		customer.setName(name);
		sc.nextLine();
		System.out.println("Enter your Email Id :");
		String email = sc.nextLine();
		customer.setEmail(email);
		System.out.println("Enter your Phone Number :");
		long phone = sc.nextLong();
		customer.setPhone(phone);
		sc.nextLine();
		System.out.println("Enter your Address :");
		String address = sc.nextLine();
		customer.setAddress(address);

		do {
			System.out.println("Enter your Passcode :");
			String passcode = sc.nextLine();

			System.out.println("Reenter your Passcode :");
			String passcode2 = sc.nextLine();

			if (passcode.equals(passcode2)) {
				customer.setPasscode(passcode);
				break;
			} else
				System.out.println(" Passwords entered does not match!! Please retry.");
		} while (true);

		customerList.add(customer);

		System.out.println(customerList.size() + ". Data has been saved.");

	}

	public void signin() {
		sc.nextLine();
		System.out.println("Sign in Details");
		boolean loop = true;
		do {
			System.out.println("Enter your Email Id :");
			String email = sc.nextLine();
			System.out.println("Enter your Passcode :");
			String passcode = sc.nextLine();

			for (Customer customerListObj : customerList) {
				if (email.equals(customerListObj.getEmail()) && passcode.equals(customerListObj.getPasscode())) {
					System.out.println("Logged in");
					foodMenu();
					foodOrder();
					loop = false;
					break;
				} else {
					System.out.println("Incorrect Email or Address. Retype the details.");
					break;
				}

			}

		} while (loop == true);
	}

	private void foodMenu() {
		System.out.println("Your Menu Card");
		System.out.println(
				"ItemList                       Price in Rupees\n1. ==Burgers== \na) Chicken                       90\nb) Cheese                        60\nc) Vegan                         65");
		System.out.println(
				"\n2. ==Pizza== \na) Chicken                       110\nb) Cheesy Veg                    90\nc) Vegan                         95");
		System.out.println(
				"\n3. ==Chicken==\na)Fried Chicken                  90\nb) Cheesy Chicken fry            75\nc) Half Grilled                  150 \nd)Full Grilled                   290");
		System.out.println(
				"\n4. ==Drinks==\na) Water                         10\nb) Coke                          20\nc) Milkshakes                    65\nd) Cappucino                     35");
	}

	public void foodOrder() {
		int main, quan, sum = 0;
		char sub;
		do {
			System.out.println("Please select the main Menu Number to order.");
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
			default:
				System.out.println("Invalid Option.");
				break;
			}
			System.out.println("Do you want to order more? 1.Yes 2.No");
		} while (true);

	}

}
