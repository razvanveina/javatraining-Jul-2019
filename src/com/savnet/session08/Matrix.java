package com.savnet.session08;

import java.util.Arrays;

public class Matrix {
	private static int[][] matrix = { //
			{ 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 }, //
			{ 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0 }, //
			{ 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0 }, //
			{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0 }, //
			{ 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1 }, //
			{ 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0 }, //
			{ 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0 }, //
			{ 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0 }, //
			{ 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0 }, //
			{ 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0 }, //
			{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, //
	};

	public static void main(String[] args) {
		showMatrix();
		fill(0, 0, 2);
		System.out.println();
		showMatrix();
		fill(0, 10, 3);
		System.out.println();
		showMatrix();
		fill(3, 0, 4);
		System.out.println();
		showMatrix();
	}

	private static void fill(int row, int col, int value) {
		// daca randul sau coloana sunt in afara matricii
		if (row < 0 || row > matrix.length - 1 || col < 0 || col > matrix[0].length - 1) {
			return;
		}

		// daca celula curenta nu este goala
		if (matrix[row][col] != 0) {
			return;
		}

		matrix[row][col] = value;
		showMatrix();
		System.out.println();
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//		}

		fill(row - 1, col, value);
		fill(row + 1, col, value);
		fill(row, col + 1, value);
		fill(row, col - 1, value);
	}

	private static void showMatrix() {
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
	}
}
