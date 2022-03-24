package java_date_problems;

import java.util.Calendar;

public class Add2Dates {

	public static void main(String[] args) {

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		Calendar added = (Calendar) c1.clone();

		// adding c2 to added(ie.c1)

		added.add(Calendar.YEAR, c2.get(Calendar.YEAR));
		added.add(Calendar.MONTH, c2.get(Calendar.MONTH));
		added.add(Calendar.DATE, c2.get(Calendar.DATE));

		// Using system.out.format(like c printf)

		System.out.format("%s + %s = %s", c1.getTime(), c2.getTime(), added.getTime());
	}

}
