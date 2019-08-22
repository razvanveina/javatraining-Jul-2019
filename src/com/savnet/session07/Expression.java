package com.savnet.session07;

import java.util.Scanner;

public class Expression {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// 5+20
		// 200-4
		// 7 * 2
		// 100 / 11
		// Integer.parseInt(s)
		// String.split / indexOf
		// trim()

		while (true) {
			String s = in.nextLine();

			System.out.println(evaluate(s));
		}
		// in.close();
	}

	private static int evaluate(String s) {
		String[] splits = s.split("[\\+-/*]");
		int operand1 = Integer.parseInt(splits[0].trim());
		int operand2 = Integer.parseInt(splits[1].trim());

		if (s.contains("+")) {
			return operand1 + operand2;
		} else if (s.contains("-")) {
			return operand1 - operand2;
		} else if (s.contains("/")) {
			return operand1 / operand2;
		} else if (s.contains("*")) {
			return operand1 * operand2;
		}

		return -1;
	}
}
