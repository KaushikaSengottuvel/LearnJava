package employee.management.system;

import java.util.Scanner;

public class ProblemMain {
	
	
	

	public static void main(String[] args) {
		String firstName;
		String lastName;
		double salary;
		boolean isPresent;
		long employeeId;
		int yearOfBirth;
		
		Employee employee = new Employee();
		DisplayDetails displayDetails = new DisplayDetails();
		Scanner scan = new Scanner(System.in);
		
		firstName = scan.next();
		employee.setFirstName(firstName);

		lastName = scan.next();
		employee.setLastName(lastName);
		
		salary = scan.nextDouble();
		employee.setSalary(salary);
		
		isPresent = scan.nextBoolean();
		employee.setPresent(isPresent);
		
		employeeId = scan.nextLong();
		employee.setEmployeeId(employeeId);
		
		yearOfBirth = scan.nextInt();
		employee.setYearOfBirth(yearOfBirth);
		
		displayDetails.displayEmployee(employee);

	}

}
