package practiceProblems;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.junit.Test;

public class PracticeDateTimeTest {
	PracticeDateTime practiceDateTime = new PracticeDateTime();
	
	@Test
	public void addDaysAndWeeksTestCase0()
	{
		LocalDate date = LocalDate.of(2021, Month.MARCH, 13);
		LocalDate result = practiceDateTime.addDaysAndWeeks(date);
		LocalDate expected = LocalDate.of(2021, Month.APRIL, 01);
		assertEquals(expected,result);
	}
	
	@Test
	public void addDaysAndWeeksTestCase1()
	{
		LocalDate date = LocalDate.of(2021, Month.APRIL, 14);
		LocalDate result = practiceDateTime.addDaysAndWeeks(date);
		LocalDate expected = LocalDate.of(2021, Month.MAY, 03);
		assertEquals(expected,result);
	}

}
