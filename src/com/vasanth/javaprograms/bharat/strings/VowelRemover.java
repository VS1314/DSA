package com.vasanth.javaprograms.bharat.strings;

import java.util.Scanner;

public class VowelRemover {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scanner.nextLine();
		System.out.println(s.replaceAll("[aeiou]", ""));
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				continue;
			} else {
				stringBuffer.append(s.charAt(i));
			}
		}
		System.out.println(stringBuffer);

		scanner.close();
	}

}
