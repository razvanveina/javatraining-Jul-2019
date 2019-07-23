package com.savnet.session02;

import java.util.Arrays;

public class ArraysThing {
	public static void main(String[] args) {
		// declaram o variabila arr care poate sa refere un array de elemente de tip int
		int[] arr = null;
		arr = new int[3];
		int[] arr2 = arr;
		arr2[1] = 7;

		System.out.println(arr[1]);

		int[] arr3 = new int[3];

		int[] arr4 = { 1, 2, 3, 4, 5, 6 };
		int[] arr41 = new int[] { 1, 2, 3, 4, 5, 6 };

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));

		System.out.println(arr4.length);

		int[][] matrix = { //
				{ 1, 2, 3 }, //
				{ 4, 5, 6, 10 }, //
				{ 7, 8, 9, 11, 12 } //
		};

		System.out.println(Arrays.toString(matrix));
		System.out.println(Arrays.toString(matrix[0]));
		System.out.println(Arrays.toString(matrix[1]));
		System.out.println(Arrays.toString(matrix[2]));

		System.out.println(matrix[0][2]);
		System.out.println(matrix[2][0]);
		System.out.println(matrix[1][1]);

		System.out.println(arr4[0]);

		System.out.println(Arrays.toString(new int[] { 1, 2, 3 }));

		int[] src = { 1, 2, 3, 4, 5 };
		int[] dest = { 0, 0, 0 };

		System.arraycopy(src, 1, dest, 0, 3);

		System.out.println(Arrays.toString(dest));

		int[] result = Arrays.copyOfRange(src, 1, 4);
		System.out.println(Arrays.toString(result));

		int[] arr8 = { 7, 4, 9, 6, 2, 9, 1 };

		Arrays.sort(arr8);
		System.out.println(Arrays.toString(arr8));

		System.out.println(Arrays.binarySearch(arr8, 6));
		System.out.println(Arrays.binarySearch(arr8, 10));

		System.out.println(Arrays.equals(arr, arr8));
		System.out.println(Arrays.equals(arr, arr));

		Arrays.fill(arr8, 1);

		System.out.println(Arrays.toString(arr8));

	}
}
