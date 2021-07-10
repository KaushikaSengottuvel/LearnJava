package com.assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class TruckLoad {

	public static void main(String[] args) {
		int boxes, trucks, limit;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Trucks :");
		trucks = scan.nextInt();
		System.out.println("Enter the Number of Boxes :");
		boxes = scan.nextInt();
		int weights[] = new int[boxes];
		int a[] = new int[trucks];
		System.out.println("Enter the Weights :");
		for (int i = 0; i < boxes; i++) {
			weights[i] = scan.nextInt();
		}

		// if truck == 1, boxes == trucks and if no of trucks > boxes

		if (trucks == 1) {
			System.out.println("Result : 0");
		} else if (trucks > boxes) {
			Arrays.sort(weights);
			System.out.print("Result : " + weights[boxes - 1]);
		} else if (trucks == boxes) {
			Arrays.sort(weights);
			int diff = weights[boxes - 1] - weights[0];
			System.out.println("Result : " + diff);
		}

		// if boxes > trucks

		/*
		 * else { int mod = boxes % trucks;
		 *
		 * if (mod == 0) { limit = boxes / trucks; } else { limit = boxes / trucks;
		 * limit += 1; } System.out.println(limit); int count = 0; a[0] = 0; for (int i
		 * = 0; i < limit; i++) { for (int j = 0; j < trucks; j++) { a[j] = a[j] +
		 * weights[count]; count++; System.out.println(a[j] + " - " + weights[count]); }
		 * } }
		 */

		scan.close();
	}
}
