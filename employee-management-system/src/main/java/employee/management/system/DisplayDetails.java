package employee.management.system;

public class DisplayDetails {
	Employee employee = new Employee();
	
	String firstName = employee.getFirstName();
	String lastName= employee.getLastName();
	double salary=employee.getEmployeeId();
	boolean isPresent=employee.isPresent();
	long employeeId=employee.getEmployeeId();
	int yearOfBirth=employee.getYearOfBirth();
	
	
	public void displayEmployee(Employee employee)
	{
		if(isPresent== false) {
			System.out.println("Employee has left the organization");
		}
		else {
	System.out.println("Employee details :\nFirstName :"+firstName+"\nLastName : "+lastName);
	System.out.println("Salary :"+salary+"\nEmployeeId :"+employeeId+"\nYearOfBirth :"+yearOfBirth);
		}
	}

}
