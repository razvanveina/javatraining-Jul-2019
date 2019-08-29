package com.savnet.session09.calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(0);
		c1.doOperation("+1");
		c1.doOperation("*5");
		c1.doOperation("*2");
		System.out.println(c1.getCurrentValue() == 10);

		Calculator c2 = new Calculator(0);
		c2.doOperation("+10");
		c2.doOperation("/5");
		System.out.println(c2.getCurrentValue() == 2);
	}
}
