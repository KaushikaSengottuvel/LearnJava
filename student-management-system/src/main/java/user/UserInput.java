package user;

import java.util.List;
import java.util.Scanner;

import exception.InvalidRollNumberException;
import exception.MarksNotCalculatedException;
import exception.RollNoNotFoundException;
import exception.StudentAlreadyExistsException;
import exception.StudentNotFoundException;
import ports.ICalculateScores;
import ports.IProcessStudent;
import service.CalculateScoresService;
import service.ProcessStudentService;
import student.Mark;
import student.PrimaryStudent;
import student.SecondaryStudent;
import student.Student;
import student.StudentDatabase;

public class UserInput {
	static int option2;

	public void printStatements() throws StudentAlreadyExistsException, InvalidRollNumberException,
			RollNoNotFoundException, StudentNotFoundException, MarksNotCalculatedException {
		ICalculateScores calculate = new CalculateScoresService();

		IProcessStudent processstud = new ProcessStudentService(calculate);

		List<Mark> marks = StudentDatabase.getMarks();

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to LearnJava School.");
		do {
			System.out.println("How can we help you ?\r\n" + "1. View all Students\r\n"
					+ "2. Register a new Student\r\n" + "3. Remove a Student");
			int option1 = scan.nextInt();
//=============================================================================
			switch (option1) {
			case 1:
				System.out.println("View all Students");
				System.out.println(
						"S.no\tRollNo\tFirstname\tLastname\tTotal Marks\tPercentage\n===============================");
				List<Student> students = StudentDatabase.getStudents();
				int sNo = 0;
				for (Student student : students) {
					System.out.println(++sNo + "\t" + student.getRollNo() + "\t" + student.getFirstName() + "\t"
							+ student.getLastName() + "\t" + calculate.getPercentageOfStudent(student.getRollNo()));

				}
				break;

//=============================================================================
			case 2:
				System.out.println("Register a new Student\r\n" + "a. Primary\r\n" + "b. Secondary");
				char typeOfStudent = scan.next().charAt(0);
				if (typeOfStudent == 'a') {
					PrimaryStudent ps = new PrimaryStudent();
					System.out.println("****** Primary Student Registration Form ******\r\n");
					System.out.println("Enter first name : ");
					String firstName = scan.next();
					ps.setFirstName(firstName);
					System.out.println("Enter Last name : ");
					String lastName = scan.next();
					ps.setLastName(lastName);
					System.out.println("Enter Roll No : ");
					long rollNo = scan.nextLong();
					ps.setRollNo(rollNo);
					System.out.println("Enter Science marks : ");
					float science = scan.nextFloat();
					ps.setScience(science);
					System.out.println("Enter English marks : ");
					float english = scan.nextFloat();
					ps.setEnglish(english);
					System.out.println("Enter Maths marks : ");
					float maths = scan.nextFloat();
					ps.setMaths(maths);
					System.out.println("Enter Social marks : ");
					float social = scan.nextFloat();
					ps.setSocial(social);
					processstud.addStudent(ps);
					System.out.println("===========Successfully Registered================");

				}
				if (typeOfStudent == 'b') {
					SecondaryStudent ss = new SecondaryStudent();
					System.out.println("****** Secondary Student Registration Form ******\r\n");
					System.out.println("Enter first name : ");
					String firstName = scan.next();
					ss.setFirstName(firstName);
					System.out.println("Enter Last name : ");
					String lastName = scan.next();
					ss.setLastName(lastName);
					System.out.println("Enter Roll No : ");
					long rollNo = scan.nextLong();
					ss.setRollNo(rollNo);
					System.out.println("Enter Physics marks : ");
					float Physics = scan.nextFloat();
					ss.setPhysics(Physics);
					System.out.println("Enter Chemistry marks : ");
					float Chemistry = scan.nextFloat();
					ss.setChemistry(Chemistry);
					System.out.println("Enter Biology marks : ");
					float Biology = scan.nextFloat();
					ss.setBiology(Biology);
					System.out.println("Enter Mathematics marks : ");
					float Mathematics = scan.nextFloat();
					ss.setMathematics(Mathematics);
					processstud.addStudent(ss);
					System.out.println("===========Successfully Registered================");

				}
				break;
//=============================================================================
			case 3:
				System.out.println("Remove a Student");
				System.out.println("Enter Roll No : ");
				long rollNo = scan.nextLong();
				processstud.removeStudent(rollNo);
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}
//=============================================================================

			System.out.println("Do you want to continue. 1. Yes, 2. No ? :");
			option2 = scan.nextInt();

		} while (option2 == 1);
		System.out.println("Thanks for using our Service !");

		scan.close();

	}

}
