package com.savnet.session09.calculator;

public class CalculatorReutilizabil {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(7);
		c1.doOperation("*3");
		c1.showCurrentValue();

		Calculator c2 = new Calculator(5);
		c2.doOperation("*5");
		c2.showCurrentValue();

		Calculator c3 = new Calculator(c1.getCurrentValue());
		c3.doOperation("+" + c2.getCurrentValue());
		c3.showCurrentValue();
	}
}
