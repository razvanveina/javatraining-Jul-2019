package com.savnet.session08;

public class Expression {
	public static void main(String[] args) {
		System.out.println(evaluate("5+3*2-8/2"));
		// System.out.println(evaluate("5+3-2"));
		// exp(5+3-2) = 5 + exp(3-2) = 5 + 3 - 2
	}

	private static int evaluate(String exp) {
		int index = exp.indexOf('+');
		if (index != -1) {
			String left = exp.substring(0, index);
			String right = exp.substring(index + 1);
			return evaluate(left) + evaluate(right);
		}

		index = exp.indexOf('-');
		if (index != -1) {
			String left = exp.substring(0, index);
			String right = exp.substring(index + 1);
			return evaluate(left) - evaluate(right);
		}

		index = exp.indexOf('*');
		if (index != -1) {
			String left = exp.substring(0, index);
			String right = exp.substring(index + 1);
			return evaluate(left) * evaluate(right);
		}

		index = exp.indexOf('/');
		if (index != -1) {
			String left = exp.substring(0, index);
			String right = exp.substring(index + 1);
			return evaluate(left) / evaluate(right);
		}
		return Integer.parseInt(exp);
	}
}
