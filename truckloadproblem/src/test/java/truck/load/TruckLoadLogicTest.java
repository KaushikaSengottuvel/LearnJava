package truck.load;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TruckLoadLogicTest {
	
	TruckLoadLogic truckLoadLogic = new TruckLoadLogic();
	UserInput userInput = new UserInput();
	
	@Test
	
	
	
	public void writeTruckLoadLogicTestCase0() {
		int trucks = 1;
		int boxes = 1;
		int[] weights = {3};
		
		userInput.setBoxes(boxes);
		userInput.setTrucks(trucks);
		userInput.setWeights(weights);
		
		int diff = truckLoadLogic.writeTruckLoadLogic(userInput);
		
		assertEquals(0,diff);
		}
	
	public void writeTruckLoadLogicTestCase1() {
		int trucks = 1;
		int boxes = 5;
		int[] weights = {1,2,3,4,5};
		
		userInput.setBoxes(boxes);
		userInput.setTrucks(trucks);
		userInput.setWeights(weights);
		
		int diff = truckLoadLogic.writeTruckLoadLogic(userInput);
		
		assertEquals(0,diff);
		}
	
	public void writeTruckLoadLogicTestCase2() {
		int trucks = 10;
		int boxes = 1;
		int[] weights = {3};
		
		userInput.setBoxes(boxes);
		userInput.setTrucks(trucks);
		userInput.setWeights(weights);
		
		int diff = truckLoadLogic.writeTruckLoadLogic(userInput);
		
		assertEquals(3,diff);
		}
	
	public void writeTruckLoadLogicTestCase3() {
		int trucks = 10;
		int boxes = 5;
		int[] weights ={1,2,3,4,5};
		
		userInput.setBoxes(boxes);
		userInput.setTrucks(trucks);
		userInput.setWeights(weights);
		
		int diff = truckLoadLogic.writeTruckLoadLogic(userInput);
		
		assertEquals(5,diff);
		}
	
	public void writeTruckLoadLogicTestCase4() {
		int trucks = 2;
		int boxes = 3;
		int[] weights = {4,5};
		
		userInput.setBoxes(boxes);
		userInput.setTrucks(trucks);
		userInput.setWeights(weights);
		
		int diff = truckLoadLogic.writeTruckLoadLogic(userInput);
		
		assertEquals(1,diff);
		}
	
	public void writeTruckLoadLogicTestCase5() {
		int trucks = 2;
		int boxes = 2;
		int[] weights = {2,5};
		
		userInput.setBoxes(boxes);
		userInput.setTrucks(trucks);
		userInput.setWeights(weights);
		
		int diff = truckLoadLogic.writeTruckLoadLogic(userInput);
		
		assertEquals(3,diff);
		}
	
	public void writeTruckLoadLogicTestCase6() {
		int trucks = 2;
		int boxes = 3;
		int[] weights = {2,3,5};
		
		userInput.setBoxes(boxes);
		userInput.setTrucks(trucks);
		userInput.setWeights(weights);
		
		int diff = truckLoadLogic.writeTruckLoadLogic(userInput);
		
		assertEquals(4,diff);
		}
	
	public void writeTruckLoadLogicTestCase7() {
		int trucks = 3;
		int boxes = 3;
		int[] weights = {2,3,5};
		
		userInput.setBoxes(boxes);
		userInput.setTrucks(trucks);
		userInput.setWeights(weights);
		
		int diff = truckLoadLogic.writeTruckLoadLogic(userInput);
		
		assertEquals(3,diff);
		}
	
	public void writeTruckLoadLogicTestCase8() {
		int trucks = 3;
		int boxes = 5;
		int[] weights = {1,2,3,4,5};
		
		userInput.setBoxes(boxes);
		userInput.setTrucks(trucks);
		userInput.setWeights(weights);
		
		int diff = truckLoadLogic.writeTruckLoadLogic(userInput);
		
		assertEquals(4,diff);
		}
	
	public void writeTruckLoadLogicTestCase9() {
		int trucks = 2;
		int boxes = 5;
		int[] weights = {4,5,6,7,8};
		
		userInput.setBoxes(boxes);
		userInput.setTrucks(trucks);
		userInput.setWeights(weights);
		
		int diff = truckLoadLogic.writeTruckLoadLogic(userInput);
		
		assertEquals(6,diff);
		}
	
	public void writeTruckLoadLogicTestCase10() {
		int trucks = 3;
		int boxes = 6;
		int[] weights = {2,5,6,7,8,14};
		
		userInput.setBoxes(boxes);
		userInput.setTrucks(trucks);
		userInput.setWeights(weights);
		
		int diff = truckLoadLogic.writeTruckLoadLogic(userInput);
		
		assertEquals(11,diff);
		}
	
	public void writeTruckLoadLogicTestCase11() {
		int trucks = 3;
		int boxes = 9;
		int[] weights = {2,5,5,8,10,12,18,19,20};
		
		userInput.setBoxes(boxes);
		userInput.setTrucks(trucks);
		userInput.setWeights(weights);
		
		int diff = truckLoadLogic.writeTruckLoadLogic(userInput);
		
		assertEquals(9,diff);
		}
	
	
}
