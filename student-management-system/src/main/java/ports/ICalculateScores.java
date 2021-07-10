package ports;

import exception.MarksNotCalculatedException;
import exception.StudentNotFoundException;
import student.Student;

public interface ICalculateScores {
	void saveTotalMarks(Student stud) throws StudentNotFoundException;

	float getPercentageOfStudent(long rollNo) throws MarksNotCalculatedException;

}
