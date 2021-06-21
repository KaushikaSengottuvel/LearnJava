package functionalInterface_practice;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check even or odd");
		int n = scan.nextInt();
		// ========================================================
		EvenOdd evenodd = () -> {
			if (n % 2 == 0)
				System.out.println("It's Even.");
			else
				System.out.println("Odd.");
		};
		evenodd.checkEvenOdd(); // calling the above function to start
		// ========================================================
		System.out.println("Enter a string to check if it is a lion");
		String s = scan.next();

		CheckLion checklion = () -> {
			if (s.equalsIgnoreCase("lion"))
				System.out.println("Yes, it is equal.");
			else
				System.out.println("Nope, It's not.");
		};
		checklion.checkLionMethod();

		// ========================================================
		System.out.println("Check valid marks \n RollNo :");
		long rollNo = scan.nextLong();
		System.out.println("Tamil Mark :");
		int Tamil = scan.nextInt();
		System.out.println("English Mark :");
		int English = scan.nextInt();
		Marks markobj = new Marks(rollNo, Tamil, English);

		CheckInvalidMark checkInvalidMark = () -> {
			if (markobj.English() <= 100 && markobj.English() >= 0)
				System.out.println("Valid Marks");
			else
				System.out.println("Invalid Marks");

		};

		checkInvalidMark.checkInvalidMarkMethod();

		scan.close();
	}

}
