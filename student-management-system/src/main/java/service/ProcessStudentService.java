package service;

import java.util.List;

import exception.InvalidRollNumberException;
import exception.RollNoNotFoundException;
import exception.StudentAlreadyExistsException;
import exception.StudentNotFoundException;
import ports.ICalculateScores;
import ports.IProcessStudent;
import student.Student;
import student.StudentDatabase;

public class ProcessStudentService implements IProcessStudent {

	// coz all obj creations shd be in same place
	private ICalculateScores calculate;

	public ProcessStudentService(ICalculateScores calculate) {
		this.calculate = calculate;
	}

	@Override
	public void removeStudent(long rollNo) throws RollNoNotFoundException {
		List<Student> students = StudentDatabase.getStudents();
		int count = 1;

		for (int i = 0; i < students.size(); i++) {

			if (rollNo == students.get(i).getRollNo()) {
				students.remove(i);

				count = 0;
			}

		}
		if (count == 1) {
			throw new RollNoNotFoundException();
		}

	}

	// =============================================================================

	@Override
	public List<Student> getAllStudents() {
		return StudentDatabase.getStudents();
		// TODO Auto-generated method stub

	}

	// =============================================================================
	@Override
	public void addStudent(Student stud)
			throws StudentAlreadyExistsException, InvalidRollNumberException, StudentNotFoundException {
		List<Student> students = StudentDatabase.getStudents();
		// StudentDatabase.getMarks();

		for (Student student : students) {

			if (student.getFirstName() == stud.getFirstName() && student.getLastName() == stud.getLastName()) {

				if (student.getRollNo() == stud.getRollNo()) {
					throw new StudentAlreadyExistsException();
				}
			} else if (student.getRollNo() == stud.getRollNo()) {
				throw new InvalidRollNumberException();
			}

		}
		students.add(stud);
		calculate.saveTotalMarks(stud);

	}

}
