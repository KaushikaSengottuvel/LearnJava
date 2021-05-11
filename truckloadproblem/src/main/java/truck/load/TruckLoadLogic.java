package truck.load;

import java.util.Arrays;

public class TruckLoadLogic {

	public void writeTruckLoadLogic(UserInput userInput) {

		// get values from userinput
		int trucks = userInput.getTrucks();
		int boxes = userInput.getBoxes();
		int[] weights = userInput.getWeights();

		int[] truckWeights = new int[trucks];
		for (int i = 0; i < boxes; i++) {
			Arrays.sort(truckWeights);
			truckWeights[0] += weights[i];
		}
		Arrays.sort(truckWeights);
		int diff=truckWeights[trucks-1] - truckWeights[0];
		System.out.println("Result : "+diff);
	}

}
