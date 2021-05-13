package practiceProblems;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.apache.commons.math3.linear.Array2DRowFieldMatrix;
import org.junit.Test;

public class PracticeArrayListTest {
	PracticeArrayList practiceArrayList = new PracticeArrayList();
	
	@Test
	public void checkArrayTestcase0()
	{
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Monkey");
		String result = practiceArrayList.checkArray(animals);
		assertEquals("Yayy",result);
	}
	
	@Test
	public void checkArrayTestcase1()
	{
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Bear");
		animals.add("Tiger");
		animals.add("Monkey");
		String result = practiceArrayList.checkArray(animals);
		assertEquals("Oops",result);
	}

}
