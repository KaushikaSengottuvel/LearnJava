package user;

import exception.InvalidRollNumberException;
import exception.MarksNotCalculatedException;
import exception.RollNoNotFoundException;
import exception.StudentAlreadyExistsException;
import exception.StudentNotFoundException;

public class ProblemMain {

	public static void main(String[] args) throws StudentAlreadyExistsException, InvalidRollNumberException,
			RollNoNotFoundException, StudentNotFoundException, MarksNotCalculatedException {
		UserInput userInput = new UserInput();
		userInput.printStatements();
	}

}
