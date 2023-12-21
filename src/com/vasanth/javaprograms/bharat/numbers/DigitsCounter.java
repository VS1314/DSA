package com.vasanth.javaprograms.bharat.numbers;

import java.util.Scanner;

public class DigitsCounter {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt(), count = 0;
		while (num != 0) {
			count++;
			num = num / 10;
		}
		System.out.println("count of digits is: " + count);
		scanner.close();

	}

}
