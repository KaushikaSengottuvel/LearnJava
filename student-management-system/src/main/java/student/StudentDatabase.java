package student;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {

	private static List<Student> students = new ArrayList<Student>();

	private static List<Mark> marks = new ArrayList<Mark>();

	public static List<Student> getStudents() {
		return students;
	}

	public static List<Mark> getMarks() {
		return marks;
	}

}
