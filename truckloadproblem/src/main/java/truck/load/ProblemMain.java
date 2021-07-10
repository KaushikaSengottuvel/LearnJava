package truck.load;

import java.util.Scanner;

public class ProblemMain {

	public static void main(String[] args) {
		int trucks;
		int boxes;
		int[] weights;

		ProblemMain problemMain = new ProblemMain();
		UserInput userInput = new UserInput();
		TruckLoadLogic truckLoadLogic = new TruckLoadLogic();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the no of trucks : ");
		trucks = scan.nextInt();
		userInput.setTrucks(trucks);

		System.out.println("Enter the no of boxes : ");
		boxes = scan.nextInt();
		userInput.setBoxes(boxes);

		System.out.println("Enter the weights : ");
		weights = new int[boxes];
		for (int i = 0; i < boxes; i++) {
			weights[i] = scan.nextInt();
		}
		userInput.setWeights(weights);

		truckLoadLogic.writeTruckLoadLogic(userInput);

		scan.close();
	}

}
