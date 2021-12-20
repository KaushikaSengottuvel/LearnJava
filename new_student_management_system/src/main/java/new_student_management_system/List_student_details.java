package new_student_management_system;

import java.util.ArrayList;
import java.util.List;

public class List_student_details {

	public List<Student> studentList = new ArrayList();

	public void list_student_details() {
		int count = 1;

		for (Student studentLis : studentList) {
			System.out.println(count++ + ". First Name  : " + studentLis.getFirstName() + " Last Name :"
					+ studentLis.getLastName());
			System.out.println("hi");
		}
		// count = 1;
	}

}
