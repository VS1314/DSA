package com.vasanth.javaprograms.telusko.complex;

public class SelectionSorting {

	public static void main(String[] args) {

		int num[] = { 9, 6, 4, 5, 8, 1, 3 };
		int size = num.length;
		int temp = 0;
		int minIndex = 0;
		System.out.println("Before Sorting..");
		for (int i : num) {
			System.out.print(i + " ");
		}

		for (int i = 0; i < size - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < size; j++) {
				if (num[minIndex] > num[j]) {
					minIndex = j;
				}
			}
			temp = num[minIndex];
			num[minIndex] = num[i];
			num[i] = temp;
		}

		System.out.println();
		System.out.println("After Sorting..");
		for (int i : num) {
			System.out.print(i + " ");
		}
	}

}
