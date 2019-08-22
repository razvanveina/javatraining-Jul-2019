package com.savnet.session07;

public class VowelCounter3 {
	static Counter[] counters = new Counter[] { //
			new Counter('a'), //
			new Counter('e'), //
			new Counter('i'), //
			new Counter('o'), //
			new Counter('u') };

	public static void main(String[] args) {
		String s = "qwe aa qewr wqe. ii erq, wer, qw er ouisdfpapqwpqe.";

		countVowels(s);

		for (Counter counter : counters) {
			System.out.println(counter.toString());
		}
	}

	private static void countVowels(String s) {
		for (char ch : s.toCharArray()) {
			for (Counter counter : counters) {
				if (counter.getCh() == ch) {
					counter.incrementCounter();
				}
			}
		}
	}
}
