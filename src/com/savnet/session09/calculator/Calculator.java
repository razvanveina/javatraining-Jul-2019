package com.savnet.session09.calculator;

public class Calculator {
	private int currentValue;

	public Calculator(int currentValue) {
		this.currentValue = currentValue;
	}

	public void doOperation(String operation) {
		char operator = operation.charAt(0);
		String operandString = operation.substring(1);
		int operand = Integer.parseInt(operandString);

		switch (operator) {
		case '+':
			currentValue += operand;
			break;
		case '-':
			currentValue -= operand;
			break;
		case '*':
			currentValue *= operand;
			break;
		case '/':
			currentValue /= operand;
			break;
		case '=':
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
