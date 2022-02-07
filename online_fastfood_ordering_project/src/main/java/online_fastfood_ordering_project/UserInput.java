package online_fastfood_ordering_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {
	int user;
	Customer customer = new Customer();
	Scanner sc = new Scanner(System.in);
	List<Customer> customerList = new ArrayList();

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
		FoodMenu menuObj = new FoodMenu();
		FoodOrder orderObj = new FoodOrder();
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
					menuObj.foodMenu();
					orderObj.foodOrder();
					loop = false;
					break;
				} else {
					System.out.println("Incorrect Email or Address. Retype the details.");
					break;
				}

			}

		} while (loop == true);
	}

}
