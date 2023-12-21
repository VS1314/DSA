package com.vasanth.javaprograms.bharat.numbers;

import java.util.Scanner;

public class SumOfOddDigits {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt(), sum = 0;
		while (num != 0) {
			digit = num % 10;
			if (digit % 2 != 0) {
				sum = sum + digit;
			}
			num = num / 10;
		}
		System.out.println("Sum of odd digits is: " + sum);
		scanner.close();
	}

}
