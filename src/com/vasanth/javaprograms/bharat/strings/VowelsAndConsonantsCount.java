package com.vasanth.javaprograms.bharat.strings;

import java.util.Scanner;

public class VowelsAndConsonantsCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scanner.nextLine();
		int vowels = 0, consonants = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				vowels++;
			} else {
				consonants++;
			}
		}
		System.out.println("The total vowels present are: " + vowels);
		System.out.println("The total consonants present are: " + consonants);
		scanner.close();
	}

}
