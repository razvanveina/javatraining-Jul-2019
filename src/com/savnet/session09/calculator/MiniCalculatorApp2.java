package com.savnet.session09.calculator;

import java.util.Scanner;

public class MiniCalculatorApp2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator(0);

		while (true) {
			calculator.showCurrentValue();
			System.out.print("> ");
			String s = scanner.nextLine();

			char operator = s.charAt(0);
			if (operator == 'x') {
				break;
			}

			calculator.doOperation(s);
		}

		scanner.close();
	}
}
