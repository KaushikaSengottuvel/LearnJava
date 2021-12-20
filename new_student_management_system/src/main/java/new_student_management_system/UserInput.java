package new_student_management_system;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class UserInput {

	private Scanner sc = new Scanner(System.in);
	private List_student_details display_student_detailsObj = new List_student_details();

	public void init() {

		int option;

		do {
			System.out.println(
					"STUDENT MANAGEMENT SYSTEM \n 1.Create a new Student \n 2.Update a student \n 3.Delete a student \n 4.Display all students \n 5.Exit");

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
				display_student_detailsObj.list_student_details();
				break;
			case 5:
				System.out.println("Thank You for using the Service");
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}
		} while (option != 5);

	}

	private void newStudent() {

		String firstName;
		String lastName;
		long id;
		String date;
		LocalDate dob;
		String emailId;

		Student studObj = new Student();

		System.out.println("Enter the student's First Name :");
		firstName = sc.next();
		studObj.setFirstName(firstName);
		System.out.println("Enter the student's Last Name :");
		lastName = sc.next();
		studObj.setLastName(lastName);
		System.out.println("Enter the student's Id :");
		id = sc.nextLong();
		studObj.setId(id);
//		System.out.println("Enter the student's Date of Birth :");
//		date = sc.nextLine();
//		dob = LocalDate.parse(date);
		System.out.println("Enter the student's EmailId :");
		emailId = sc.next();
		studObj.setEmailId(emailId);

		// local list
		List<Student> studentList = display_student_detailsObj.studentList;
		studentList.add(studObj);

		System.out.println("Data has been saved.");

	}

}
