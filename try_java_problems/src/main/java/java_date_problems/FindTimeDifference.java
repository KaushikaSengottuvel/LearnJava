package java_date_problems;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class FindTimeDifference {

	public static void main(String[] args) {
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Time 1 :");
		s1 = sc.nextLine();
		System.out.println("Enter the Time 2 :");
		s2 = sc.nextLine();

		LocalTime localTime1 = LocalTime.parse(s1);
		LocalTime localTime2 = LocalTime.parse(s2);
		// use 'duration' for time and 'period' for date
		Duration duration = Duration.between(localTime1, localTime2);

		// Result in predefined format.
		System.out.println("Difference :" + duration);

		sc.close();
	}

}
