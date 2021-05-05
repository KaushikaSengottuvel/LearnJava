package com.assignment_4;

public class AddMatrix {
	int[][] c = new int[2][3];

	public int[][] addTwoMatrix(int[][] a, int[][] b) {

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;

	}

	public static void main(String[] args) {
		AddMatrix add = new AddMatrix();
		int[][] a = { { 2, 3, 4 }, { 6, 7, 8 } };
		int[][] b = { { 5, 6, 22 }, { 23, 45, 9 } };
		int[][] c = new int[2][3];
		c = add.addTwoMatrix(a, b);
		System.out.println("Resultant : ");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
