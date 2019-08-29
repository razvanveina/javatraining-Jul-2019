package com.savnet.session09.calculator;

public class Calculator2 {
	private int currentValue;

	public Calculator2(int currentValue) {
		this.currentValue = currentValue;
	}

	public void doOperation(String operation) {
		char operator = operation.charAt(0);
		String operandString = operation.substring(1);
		int operand = Integer.parseInt(operandString);
		Operation op = Operation.getOperationByChar(operator);

		switch (op) {
		case PLUS:
			currentValue += operand;
			break;
		case MINUS:
			currentValue -= operand;
			break;
		case MULTIPLY:
			currentValue *= operand;
			break;
		case DIVIDE:
			currentValue /= operand;
			break;
		case ASSIGN:
			currentValue = operand;
			break;
		}
	}

	public void showCurrentValue() {
		System.out.println(currentValue);
	}

	public int getCurrentValue() {
		return this.currentValue;
	}
}
