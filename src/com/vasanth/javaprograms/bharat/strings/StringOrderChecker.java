package com.vasanth.javaprograms.bharat.strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringOrderChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scanner.nextLine();
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);
		System.out.println(new String(charArray).equals(s));
		scanner.close();
	}

}
