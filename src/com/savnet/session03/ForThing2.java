package com.savnet.session03;

public class ForThing2 {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 54, 3, 4, 76, 8, 8 };

		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			System.out.println(element);
		}

		// enhanced for / for-each
		for (int element : arr) {
			System.out.println(element);
		}
	}
}
