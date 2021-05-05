package com.assignment_4;

import java.util.Arrays;

public class LearnArrayList {

	public static void main(String[] args) {

		int[] scores = { 99, 4, 23, 67, 89, 10, 67, 9, 23, 88, 45, 9, 37, 8, 12, 2, 100 };
		Arrays.sort(scores);

		scores[3] = 100;
		System.out.println("Index position of 99 - " + Arrays.binarySearch(scores, 99));
		System.out.println("Index position of 67 - " + Arrays.binarySearch(scores, 67));
		System.out.println("Index position of 2 - " + Arrays.binarySearch(scores, 2));
		System.out.println("Index position of 200 - " + Arrays.binarySearch(scores, 200));
		for (int score : scores) {
			System.out.print(score + " ");
		}

	}

}
