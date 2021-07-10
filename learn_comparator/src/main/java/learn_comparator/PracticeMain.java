package learn_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PracticeMain {

	public static void main(String[] args) {

		Student studentObj1 = new Student(123, "Kaushi", "NKl");
		Student studentObj2 = new Student(456, "Shiku", "salem");
		Student studentObj3 = new Student(126, "Daphy", "Germany");
		Student studentObj4 = new Student(452, "Swetha", "Chennai");
		List<Student> studentList = new ArrayList();
		studentList.add(studentObj1);
		studentList.add(studentObj2);
		studentList.add(studentObj3);
		studentList.add(studentObj4);

		System.out.println(studentList);

		Comparator<Student> comparebyrollNo = (a, b) -> a.getRollNo() - b.getRollNo();

		Collections.sort(studentList, comparebyrollNo);

		System.out.println(studentList);

		Comparator<Student> comparebyName = (a, b) -> a.getName().compareTo(b.getName());

		Collections.sort(studentList, comparebyName);

		System.out.println(studentList);

	}

}
