package com.vasanth.javaprograms.telusko.complex;

public class QuickSortByDivideAndConquer {

	public static void main(String[] args) {
		int num[] = { 5, 7, 1, 3, 2 };
		System.out.println("Before Sorting..");
		for (int i : num) {
			System.out.print(i + " ");
		}
		quickSort(num, 0, num.length - 1);
		System.out.println();
		System.out.println("After Sorting..");
		for (int i : num) {
			System.out.print(i + " ");
		}
	}

	public static void quickSort(int[] num, int low, int high) {
		if (low < high) {
			int pi = partition(num, low, high);
			quickSort(num, low, pi - 1);
			quickSort(num, pi + 1, high);
		}
	}

	private static int partition(int[] num, int low, int high) {
		int pivot = num[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (num[j] < pivot) {
				i++;
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
			}
		}
		int temp = num[i + 1];
		num[i + 1] = num[high];
		num[high] = temp;
		return i + 1;
	}

}
