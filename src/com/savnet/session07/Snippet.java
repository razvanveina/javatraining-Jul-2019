package com.savnet.session07;

public class Snippet {
	public static void main(String[] args) {
		System.out.println(contains(new int[] { 1, 2, 3, 4, 2, 1, 3, 4 }, new int[] { 4, 1, 2 }));
	}

	private static boolean contains(int[] a, int[] b) {
		int indexA = 0;
		int indexB = 0;

		while (indexB < b.length) {
			if (a[indexA] == b[indexB]) {
				indexB++;
				if (indexB == b.length) {
					return true;
				}
			}
			indexA++;
			if (indexA == a.length) {
				return false;
			}
		}
		return false;

	}

}
