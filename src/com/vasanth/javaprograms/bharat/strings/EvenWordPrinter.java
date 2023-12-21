package com.vasanth.javaprograms.bharat.strings;

import java.util.Scanner;

public class EvenWordPrinter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scanner.nextLine();
		String[] words = s.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() % 2 == 0) {
				System.out.println(words[i]);
			}
		}
		scanner.close();
	}

}
