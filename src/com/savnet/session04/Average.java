package com.savnet.session04;

public class Average {
	public static void main(String[] args) {
		int[] arr = { 9, 9, 8 };
		double average = avg(arr);
		System.out.println(average);

		System.out.println(avg(arr));
		System.out.println(avg(new int[] { 5, 6, 4, 4, 4, 5 }));
	}

	private static double avg(int[] sir) {
		double sum = 0;

		for (int element : sir) {
			sum += element;
		}

		return sum / sir.length;
	}
}
