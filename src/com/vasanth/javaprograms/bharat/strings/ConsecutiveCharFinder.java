package com.vasanth.javaprograms.bharat.strings;

import java.util.Scanner;

public class ConsecutiveCharFinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scanner.nextLine();
		boolean found = false;
		for (int i = 0, j = 1; i < s.length() - 1; i++, j++) {
			if (s.charAt(i) == s.charAt(j)) {
				found = true;
				break;
			}
		}
		System.out.println(found);
		scanner.close();
	}

}
