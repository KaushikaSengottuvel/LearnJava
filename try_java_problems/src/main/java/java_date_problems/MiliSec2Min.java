package java_date_problems;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MiliSec2Min {

	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Get Current Date or Time without format :" + localDateTime);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss", Locale.GERMAN);
		String formattedString = localDateTime.format(dateTimeFormatter);

		System.out.println("Get Current Date or Time with a format and german locale:" + formattedString);
	}

}
