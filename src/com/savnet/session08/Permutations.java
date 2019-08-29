package com.savnet.session08;

public class Permutations {
	// abc, acb, bac, bca, cab, cba
	public static void main(String[] args) {
		showPermutations("", "abc");
	}

	private static void showPermutations(String prefix, String s) {
		if (s.length() == 1) {
			System.out.println(prefix + s);
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String rest = s.substring(0, i) + s.substring(i + 1);
			showPermutations(prefix + ch, rest);
		}
	}
}
