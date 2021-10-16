package new_student_management_system;

import java.util.Scanner;

public class ProblemMain {

	int option;

	public void init() {

		do {
			System.out.println(
					"STUDENT MANAGEMENT SYSTEM \n 1.Create a new Student \n 2.Update a student \n 3.Delete a student \n 4.Exit");
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();

			switch (option) {
			case 1:
				newStudent();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.out.println("Thank You for using the Service");
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}
		} while (option != 4);

	}

	private void newStudent() {

	}

	public static void main(String args[]) {

		ProblemMain mainObj = new ProblemMain();
		mainObj.init();

	}
}
