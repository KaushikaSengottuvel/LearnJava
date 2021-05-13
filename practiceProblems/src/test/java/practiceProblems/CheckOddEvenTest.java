package practiceProblems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckOddEvenTest {
	
	private CheckOddEven checkOddEven = new CheckOddEven();
	
	@Test	
	public void oddEvenTestCase0()
	{
		boolean result = checkOddEven.oddEven(56);
		assertEquals(true,result);
	}
	@Test
	public void oddEvenTestCase1()
	{		
		boolean result = checkOddEven.oddEven(65);
		assertEquals(false,result);
	}

}
