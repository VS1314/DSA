package com.vasanth.javaprograms.bharat.arraysandmatrices;

import java.util.Scanner;

public class MatrixColumnSwap {

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
		int swapColumn1 = scanner.nextInt();
		int swapColumn2 = scanner.nextInt();
		int temp = 0;
		for (int i = 0; i < c; i++) {
			temp = a[i][swapColumn1 - 1];
			a[i][swapColumn1 - 1] = a[i][swapColumn2 - 1];
			a[i][swapColumn2 - 1] = temp;
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
