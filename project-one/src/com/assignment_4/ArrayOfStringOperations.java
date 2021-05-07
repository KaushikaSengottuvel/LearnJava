package com.assignment_4;

public class ArrayOfStringOperations {
	public static StringBuilder sb = new StringBuilder();

	public String processAnimals(String animals[]) {
		String modified = "";
		animals[2] = "Bear";
		int i = 1;
		for (String animal : animals) {
			sb.append(i).append(".").append(animal).append(" ");
			i++;
		}

		modified = sb.toString();
		return modified;

	}

	public static void main(String[] args) {
		ArrayOfStringOperations as = new ArrayOfStringOperations();
		String[] animals = { "Caiman", "Caiman Lizard", "Cairn Terrier", "Camel", "Camel Spider", "Canaan Dog",
				"Canadian Eskimo Dog", "Capybara", "Caracal", "Carolina Dog", "Carp", "Cassowary", "Cat", "Caterpillar",
				"Catfish", "Cavador", "Cavalier King Charles Spaniel", "Cavapoo", "Centipede", "Cesky Fousek",
				"Cesky Terrier", "Chameleon", "Chamois", "Cheagle", "Cheetah", "Chesapeake Bay Retriever", "Chicken",
				"Chihuahua", "Chimaera", "Chimpanzee", "Chinchilla", "Chinese Crested Dog", "Chinese Paddlefish",
				"Chinook", "Chinstrap Penguin", "Chipmunk", "Chipoo" };
		// sb.append(animals);

		String modified = as.processAnimals(animals);
		System.out.println(modified);
	}

}
