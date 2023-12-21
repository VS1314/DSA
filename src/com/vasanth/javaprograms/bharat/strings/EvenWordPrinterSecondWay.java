package com.vasanth.javaprograms.bharat.strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EvenWordPrinterSecondWay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scanner.nextLine();
		StringTokenizer tokenizer = new StringTokenizer(s);
		while (tokenizer.hasMoreTokens()) {
			String eachToken = tokenizer.nextToken();
			if (eachToken.length() % 2 == 0) {
				System.out.println(eachToken);
			}
		}
		scanner.close();
	}

}
