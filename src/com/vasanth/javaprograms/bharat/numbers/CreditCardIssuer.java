package com.vasanth.javaprograms.bharat.numbers;

import java.util.Scanner;

public class CreditCardIssuer {

	public static void main(String[] args) {
		System.out.println("Enter a Credit score: ");
		try (Scanner scanner = new Scanner(System.in)) {
			int creditSCore = scanner.nextInt();
			if (creditSCore < 400 || creditSCore > 850) {
				System.out.println("Invalid Credit Score");
			} else {
				if (creditSCore >= 400 && creditSCore < 600) {
					System.out.println("Silver Card");
				} else if (creditSCore >= 600 && creditSCore < 800) {
					System.out.println("Gold Card");
				} else {
					System.out.println("Platinum Card");
				}
			}
		}
	}

}
