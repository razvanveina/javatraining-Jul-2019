package com.savnet.session07;

public class Counter {
	private char ch;
	private int count;

	public Counter(char ch) {
		this.ch = ch;
	}

	public void incrementCounter() {
		count++;
	}

	@Override
	public String toString() {
		return ch + "=" + count;
	}

	public char getCh() {
		return ch;
	}

}
