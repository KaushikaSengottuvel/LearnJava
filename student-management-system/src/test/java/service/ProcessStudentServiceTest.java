package service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import exception.InvalidRollNumberException;
import exception.RollNoNotFoundException;
import exception.StudentAlreadyExistsException;
import exception.StudentNotFoundException;
import student.PrimaryStudent;
import student.SecondaryStudent;
import student.Student;
import student.StudentDatabase;

public class ProcessStudentServiceTest {

	private ProcessStudentService processStudentService;

	public ProcessStudentServiceTest() {
		CalculateScoresService calculateScoresService = new CalculateScoresService();
		processStudentService = new ProcessStudentService(calculateScoresService);
	}

	@Before
	public void cleanUp() {
		List<Student> students = StudentDatabase.getStudents();
		students.clear();
	}

	@Test
	public void removeStudentTest_WhenRollNoIsFound() throws RollNoNotFoundException, StudentNotFoundException {
		long rollNo = 123;
		List<Student> students = StudentDatabase.getStudents();
		Student student1 = createPrimaryStudent(rollNo);
		students.add(student1);

		assertEquals(1, students.size());
		processStudentService.removeStudent(rollNo);
		assertEquals(0, students.size());

	}

	@Test(expected = RollNoNotFoundException.class)
	public void removeStudentTest_WhenRollNoIsNotFound() throws RollNoNotFoundException, StudentNotFoundException {
		long rollNo = 123;
		List<Student> students = StudentDatabase.getStudents();
		Student student1 = createPrimaryStudent(rollNo);
		students.add(student1);

		assertEquals(1, students.size());
		processStudentService.removeStudent(1);

	}

	// ======================================================

	@Test(expected = StudentAlreadyExistsException.class)
	public void addStudent_WhenStudentAlreadyExists_primary()
			throws StudentAlreadyExistsException, StudentNotFoundException, InvalidRollNumberException {
		List<Student> students = StudentDatabase.getStudents();
		Student student1 = createPrimaryStudent(100);
		students.add(student1);
		processStudentService.addStudent(student1);

	}

	@Test(expected = InvalidRollNumberException.class)
	public void addStudent_WhenHadInvalidRollNo_primary()
			throws StudentAlreadyExistsException, StudentNotFoundException, InvalidRollNumberException {
		List<Student> students = StudentDatabase.getStudents();
		Student student1 = createPrimaryStudent("Kaushika", 101);
		Student student2 = createPrimaryStudent("Karthick", 101);
		processStudentService.addStudent(student1);
		processStudentService.addStudent(student2);

	}

	@Test(expected = StudentAlreadyExistsException.class)
	public void addStudent_WhenStudentAlreadyExists_secondary()
			throws StudentAlreadyExistsException, StudentNotFoundException, InvalidRollNumberException {
		List<Student> students = StudentDatabase.getStudents();
		Student student1 = createSecondaryStudent(100);
		students.add(student1);
		processStudentService.addStudent(student1);

	}

	@Test(expected = InvalidRollNumberException.class)
	public void addStudent_WhenHadInvalidRollNo_secondary()
			throws StudentAlreadyExistsException, StudentNotFoundException, InvalidRollNumberException {
		List<Student> students = StudentDatabase.getStudents();
		Student student1 = createSecondaryStudent("Kaushika", 101);
		Student student2 = createSecondaryStudent("Karthick", 101);
		processStudentService.addStudent(student1);
		processStudentService.addStudent(student2);

	}

	@Test
	public void getAllStudentsTest() throws StudentNotFoundException {
		List<Student> students = StudentDatabase.getStudents();
		Student student1 = createSecondaryStudent(100);
		Student student2 = createPrimaryStudent(101);
		students.add(student1);
		students.add(student2);
		processStudentService.getAllStudents();
		int size = processStudentService.getAllStudents().size();
		assertEquals(2, size);

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

	private PrimaryStudent createPrimaryStudent(String firstName, long rollNo) throws StudentNotFoundException {
		PrimaryStudent primary = new PrimaryStudent();
		// CalculateScoresService calculate = new CalculateScoresService();
		primary.setEnglish(50);
		primary.setMaths(50);
		primary.setScience(50);
		primary.setSocial(52);
		primary.setFirstName(firstName);
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

	private SecondaryStudent createSecondaryStudent(String firstName, long rollNo) throws StudentNotFoundException {
		SecondaryStudent secondary = new SecondaryStudent();
		// CalculateScoresService calculate = new CalculateScoresService();
		secondary.setPhysics(50);
		secondary.setChemistry(50);
		secondary.setBiology(50);
		secondary.setMathematics(52);
		secondary.setFirstName(firstName);
		secondary.setLastName("Sengottuvel");
		secondary.setRollNo(rollNo);
		// calculate.saveTotalMarks(null);
		return secondary;
	}

}
