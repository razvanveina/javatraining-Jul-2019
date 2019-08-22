package com.savnet.session07;

public class WordCounter {
	public static void main(String[] args) {
		String s = "qwe qwe qewr wqe. rqw erq, wer, qw er qwerqwer.";

		System.out.println(countWords(s));
	}

	private static int countWords(String s) {
		String[] splits = s.split("[ ,.]");
		int empty = 0;
		for (String ss : splits) {
			if (ss.isEmpty()) {
				empty++;
			}
		}

		return splits.length - empty;
	}
}
