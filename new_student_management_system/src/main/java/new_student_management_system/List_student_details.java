package new_student_management_system;

import java.util.ArrayList;
import java.util.List;

public class List_student_details {

	Student studObj = new Student();
	List<Student> studentList = new ArrayList();

	public void list_student_details() {
		int count = 1;

		studentList.add(studObj);

		for (Student studentLis : studentList) {
			System.out.println(
					count++ + "First Name- : " + studObj.getFirstName() + "Last Name :" + studObj.getLastName());
		}

	}

}
