package com.savnet.session07;

public class VowelCounter {
	public static void main(String[] args) {
		String s = "qwe aa qewr wqe. ii erq, wer, qw er ouisdfpapqwpqe.";

		int[] count = countVowels(s);
		System.out.println("a=" + count[0]);
		System.out.println("e=" + count[1]);
		System.out.println("i=" + count[2]);
		System.out.println("o=" + count[3]);
		System.out.println("u=" + count[4]);
		System.out.println("q=" + count[5]);
	}

	private static int[] countVowels(String s) {
		int[] count = new int[6];
		for (char ch : s.toCharArray()) {
			switch (ch) {
			case 'a':
				count[0]++;
				break;
			case 'e':
				count[1]++;
				break;
			case 'i':
				count[2]++;
				break;
			case 'o':
				count[3]++;
				break;
			case 'u':
				count[4]++;
				break;
			case 'q':
				count[5]++;
				break;
			}
		}

		return count;

	}
}
