package com.vasanth.javaprograms.bharat.arraysandmatrices;

import java.util.Scanner;

public class MatrixRowSwap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r = scanner.nextInt();
		System.out.println("Enter the number of columns");
		int c = scanner.nextInt();
		int a[][] = new int[r][c];
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

		System.out.println("Enter the rows to swap");
		int swapRow1 = scanner.nextInt();
		int swapRow2 = scanner.nextInt();
		int temp = 0;
		for (int i = 0; i < r; i++) {
			temp = a[swapRow1 - 1][i];
			a[swapRow1 - 1][i] = a[swapRow2 - 1][i];
			a[swapRow2 - 1][i] = temp;
		}
		System.out.println("The Swaped matrix is");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
