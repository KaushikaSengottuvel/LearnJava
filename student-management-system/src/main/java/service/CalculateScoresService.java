package service;

import java.util.List;

import exception.MarksNotCalculatedException;
import exception.StudentNotFoundException;
import ports.ICalculateScores;
import student.Mark;
import student.PrimaryStudent;
import student.SecondaryStudent;
import student.Student;
import student.StudentDatabase;

public class CalculateScoresService implements ICalculateScores {

	// ====================================================================

	public CalculateScoresService() {

	}

	@Override
	public void saveTotalMarks(Student stud) throws StudentNotFoundException {
		List<Student> students = StudentDatabase.getStudents();
		List<Mark> marks = StudentDatabase.getMarks();
		float totalMarks = 0.0f;
		int count = 1;

		for (Student student : students) {
			if (student.getRollNo() == stud.getRollNo()) {
				count = 0;
			}

		}
		if (count == 1)
			throw new StudentNotFoundException();

		if (stud instanceof PrimaryStudent) {

			PrimaryStudent ps = (PrimaryStudent) stud;

			totalMarks = ps.getEnglish() + ps.getMaths() + ps.getScience() + ps.getSocial();

		}

		if (stud instanceof SecondaryStudent) {

			SecondaryStudent ss = (SecondaryStudent) stud;

			totalMarks = ss.getBiology() + ss.getChemistry() + ss.getPhysics() + ss.getMathematics();

		}

		Mark m = new Mark(stud.getRollNo(), totalMarks);
		marks.add(m);

	}

	// ====================================================================

	@Override
	public float getPercentageOfStudent(long rollNo) throws MarksNotCalculatedException {
		int count = 1;
		List<Student> students = StudentDatabase.getStudents();
		List<Mark> marks = StudentDatabase.getMarks();
		float totalMarks = 0.0f;
		for (Student student : students) {
			if (student.getRollNo() == rollNo) {
				count = 0;
			}
		}

		for (Mark mark : marks) {
			if (mark.getRollNo() != rollNo) {
				count = 0;
			}
		}

		if (count == 0)
			throw new MarksNotCalculatedException();

		float percentage = totalMarks / 400 * 100;

		return percentage;
		// TODO Auto-generated method stub

	}
}
