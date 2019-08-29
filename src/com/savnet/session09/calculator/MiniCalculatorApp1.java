package com.savnet.session09.calculator;

import java.util.Scanner;

public class MiniCalculatorApp1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int currentValue = 0;

		while (true) {
			System.out.println(currentValue);
			System.out.print("> ");
			String s = scanner.nextLine();

			char operator = s.charAt(0);
			if (operator == 'x') {
				break;
			}
			String operandString = s.substring(1);
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

		scanner.close();
	}
}
