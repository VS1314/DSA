package com.vasanth.javaprograms.bharat.numbers;

public class SpecialTwoDigitsAllTwoDigits {

	public static void main(String[] args) {
		int digit1, digit2, result = 0;
		for (int i = 10; i < 100; i++) {
			digit1 = i % 10;
			digit2 = i / 10;
			result = (digit1 + digit2) + (digit1 * digit2);

			if (result == i) {
				System.out.println("Special 2 digit number: " + i);
			} else {
				System.out.println("Normal number: " + i);
			}
		}
	}
}
