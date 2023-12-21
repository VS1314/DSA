package com.vasanth.javaprograms.bharat.numbers;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num <= 0) {
			System.out.println("Invalid number " + num);
		} else {
			if (num % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		}
		scanner.close();
	}
}
