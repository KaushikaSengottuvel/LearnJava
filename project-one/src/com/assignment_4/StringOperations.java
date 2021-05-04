package com.assignment_4;

public class StringOperations {

	public String doStringOperations() {
		String tiger = " The tiger is listed as Endangered on the IUCN Red List.";
		StringBuilder stringbuilder = new StringBuilder(tiger);
		System.out.println("Given String : " + stringbuilder);

		System.out.println("APPENDED STRING WITH IUCN REMOVED AND WHITE SPACED TRIMMED : " + stringbuilder.append(
				" The tiger is among the most recognisable and popular of the world's charismatic megafauna. As of 2015, the global wild tiger population was estimated to number between 3,062.")
				.delete(42, 46).toString().trim());

		String lion = stringbuilder.append("The generic name Panthera is derived from the Latin word panthera")
				.toString().replaceAll("tiger", "lion").toLowerCase();
		return lion;
	}

	public static void main(String[] args) {
		StringOperations stringOperation = new StringOperations();
		String lion = stringOperation.doStringOperations();
		System.out.println("2ND APPEND WITH A WORD REPLACED AND STRING TO LOWERCASE :" + lion);
	}

}
