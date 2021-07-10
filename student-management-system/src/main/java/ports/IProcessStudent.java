package ports;

import java.util.List;

import exception.InvalidRollNumberException;
import exception.RollNoNotFoundException;
import exception.StudentAlreadyExistsException;
import exception.StudentNotFoundException;
import student.Student;

public interface IProcessStudent {

	void removeStudent(long rollNo) throws RollNoNotFoundException;

	List<Student> getAllStudents();

	void addStudent(Student stud)
			throws StudentAlreadyExistsException, InvalidRollNumberException, StudentNotFoundException;

}
