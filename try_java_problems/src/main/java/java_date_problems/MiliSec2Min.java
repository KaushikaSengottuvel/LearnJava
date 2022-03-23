package java_date_problems;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class MiliSec2Min {

	public static void main(String[] args) {

		long milliseconds = 234023400;

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Get Current Date or Time without format :" + localDateTime);

		// Custom formatting
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss", Locale.GERMAN);
		String formattedString = localDateTime.format(dateTimeFormatter);

		System.out.println("Get Current Date or Time with a format and german locale:" + formattedString);

		// Convert milliseconds to minutes using TIMEUNIT
		long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);
		long seconds = TimeUnit.MINUTES.toSeconds(minutes);
		System.out.println("Converted milliseconds to minutes : " + minutes);
		System.out.println("Converted minutes to seconds : " + seconds);

	}

}
