package java_string_problems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringToDate {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		s = sc.nextLine();
		LocalDate ld = LocalDate.parse(s, DateTimeFormatter.ISO_DATE);
		System.out.println("With given Predefined format :" + ld);
		DateTimeFormatter dformatter = DateTimeFormatter.ofPattern("MMM d yyyy");
		String ld1 = ld.format(dformatter);
		System.out.println("With Custom Format : " + ld1);
		sc.close();
	}

}
