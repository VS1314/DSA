package com.vasanth.javaprograms.bharat.strings;

import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scanner.nextLine();
		System.out.println(input.split(" ").length);
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isWhitespace(input.charAt(i))) {
				count++;
			}
		}
		System.out.println(count + 1);
		scanner.close();
	}

}
