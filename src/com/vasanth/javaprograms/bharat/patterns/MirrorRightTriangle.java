package com.vasanth.javaprograms.bharat.patterns;

import java.util.Scanner;

public class MirrorRightTriangle {

	public static void main(String[] args) {
		System.out.println("How many numbers");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= n - i) {
					System.out.print(" ");
				} else {
					System.out.print(/* " " + */ j);
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print(/* " " + */ j);
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
