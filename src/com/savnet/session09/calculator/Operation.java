package com.savnet.session09.calculator;

public enum Operation {
	PLUS('+'), MINUS('-'), MULTIPLY('*'), DIVIDE('/'), ASSIGN('='), EXIT('q');

	private char sign;

	private Operation(char sign) {
		this.sign = sign;
	}

	public static Operation getOperationByChar(char sign) {
		for (Operation op : values()) {
			if (op.sign == sign) {
				return op;
			}
		}
		return null;
	}
}