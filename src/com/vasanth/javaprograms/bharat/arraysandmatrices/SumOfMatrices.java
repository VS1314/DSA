package com.vasanth.javaprograms.bharat.arraysandmatrices;

import java.util.Scanner;

public class SumOfMatrices {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r = scanner.nextInt();
		System.out.println("Enter the number of columns");
		int c = scanner.nextInt();
		int a[][] = new int[r][c];
		int b[][] = new int[r][c];
		int sum[][] = new int[r][c];

		System.out.println("Enter the matrix1");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Enter the matrix2");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				b[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("The sum is");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
