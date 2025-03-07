package com.vasanth.javaprograms.bharat.arraysandmatrices;

import java.util.Scanner;

public class SparseMatrix {

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
		int count = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (a[i][j] == 0) {
					count++;
				}
			}
		}
		if (count > (r * c) / 2) {
			System.out.println("Sparse Matrix");
		} else {
			System.out.println("Not a Sparse Matrix");
		}
		scanner.close();
	}

}
