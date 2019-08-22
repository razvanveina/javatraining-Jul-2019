package com.savnet.session07;

public class VowelCounter2 {
	static char[] chars = new char[] { 'a', 'e', 'i', 'o', 'u', 'q' };

	public static void main(String[] args) {
		String s = "qwe aa qewr wqe. ii erq, wer, qw er ouisdfpapqwpqe.";

		int[] count = countVowels(s);

		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i] + "=" + count[i]);
		}
	}

	private static int[] countVowels(String s) {
		int[] count = new int[chars.length];

		for (char ch : s.toCharArray()) {
			for (int i = 0; i < chars.length; i++) {
				if (ch == chars[i]) {
					count[i]++;
				}
			}
		}

		return count;

	}
}
