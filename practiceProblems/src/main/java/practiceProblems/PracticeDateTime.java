package practiceProblems;

import java.time.LocalDate;
import java.time.LocalTime;

public class PracticeDateTime {
	
	public LocalDate addDaysAndWeeks(LocalDate date)
	{
		return date.plusDays(5).plusWeeks(2);
			
	}
	
	public LocalTime removeTwoHours(LocalTime time)
	{
		return time.minusHours(2);
	}

}
