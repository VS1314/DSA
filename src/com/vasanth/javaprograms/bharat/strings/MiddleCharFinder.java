package com.vasanth.javaprograms.bharat.strings;

import java.util.Scanner;

public class MiddleCharFinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scanner.next();
		int length = input.length();
		if (length % 2 == 0) {
			System.out.println(input.substring(length / 2 - 1, length / 2 + 1));
		} else {
			System.out.println(input.substring(length / 2, length / 2 + 1));
		}
		scanner.close();
	}

}
