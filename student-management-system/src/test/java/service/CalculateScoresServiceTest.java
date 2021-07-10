package service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import exception.MarksNotCalculatedException;
import exception.StudentNotFoundException;
import student.PrimaryStudent;
import student.SecondaryStudent;
import student.Student;
import student.StudentDatabase;

public class CalculateScoresServiceTest {

	private CalculateScoresService calculate = new CalculateScoresService();

	@Test
	public void getPercentageOfStudent_when_marks_calculated()
			throws StudentNotFoundException, MarksNotCalculatedException {
		List<Student> students = StudentDatabase.getStudents();
		Student student1 = createPrimaryStudent(101);
		float actual = calculate.getPercentageOfStudent(101);
		float exp = 252 / 100;
		assertEquals(exp, actual, 0.0);

	}

	@Test(expected = MarksNotCalculatedException.class)
	public void getPercentageOfStudent_when_marks_not_calculated()
			throws StudentNotFoundException, MarksNotCalculatedException {
		List<Student> students = StudentDatabase.getStudents();
		Student student1 = createPrimaryStudent(101);
		calculate.getPercentageOfStudent(102);

	}

	private PrimaryStudent createPrimaryStudent(long rollNo) throws StudentNotFoundException {
		PrimaryStudent primary = new PrimaryStudent();
		// CalculateScoresService calculate = new CalculateScoresService();
		primary.setEnglish(50);
		primary.setMaths(50);
		primary.setScience(50);
		primary.setSocial(52);
		primary.setFirstName("Kaushika");
		primary.setLastName("Sengottuvel");
		primary.setRollNo(rollNo);
		// calculate.saveTotalMarks(null);
		return primary;
	}

	private SecondaryStudent createSecondaryStudent(long rollNo) throws StudentNotFoundException {
		SecondaryStudent secondary = new SecondaryStudent();
		// CalculateScoresService calculate = new CalculateScoresService();
		secondary.setPhysics(50);
		secondary.setChemistry(50);
		secondary.setBiology(50);
		secondary.setMathematics(52);
		secondary.setFirstName("Kaushika");
		secondary.setLastName("Sengottuvel");
		secondary.setRollNo(rollNo);
		// calculate.saveTotalMarks(null);
		return secondary;
	}

}
