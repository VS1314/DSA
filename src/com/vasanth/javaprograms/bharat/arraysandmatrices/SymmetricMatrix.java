package com.vasanth.javaprograms.bharat.arraysandmatrices;

import java.util.Scanner;

public class SymmetricMatrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r = scanner.nextInt();
		System.out.println("Enter the number of columns");
		int c = scanner.nextInt();
		int a[][] = new int[r][c];
		int b[][] = new int[c][r];
		System.out.println("Enter the matrix");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		System.out.println("The matrix is");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				b[i][j] = a[j][i];
			}
		}
		System.out.println("The Transpose matrix is");
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		boolean flag = true;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (a[i][j] != b[i][j]) {
					flag = false;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("Symmetric");
		} else {
			System.out.println("Asymmetric");
		}
		scanner.close();
	}

}
