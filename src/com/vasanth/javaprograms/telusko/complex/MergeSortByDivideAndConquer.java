package com.vasanth.javaprograms.telusko.complex;

public class MergeSortByDivideAndConquer {

	public static void main(String[] args) {

		int num[] = { 3, 5, 1, 4, 6, 2 };
		for (int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();

		mergeSort(num, 0, num.length - 1);

		System.out.println("After Sorting");
		for (int i : num) {
			System.out.print(i + " ");
		}
	}

	public static void mergeSort(int[] num, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(num, left, mid);
			mergeSort(num, mid + 1, right);
			merge(num, left, mid, right);

		}
	}

	private static void merge(int[] num, int left, int mid, int right) {
		int leftArrSize = mid - left + 1;
		int rightArrSize = right - mid;
		int leftArr[] = new int[leftArrSize];
		int rightArr[] = new int[rightArrSize];
		for (int i = 0; i < leftArrSize; i++) {
			leftArr[i] = num[left + i];
		}
		for (int i = 0; i < rightArrSize; i++) {
			rightArr[i] = num[mid + 1 + i];
		}
		int i = 0;
		int j = 0;
		int k = left;
		while (i < leftArrSize && j < rightArrSize) {
			if (leftArr[i] <= rightArr[j]) {
				num[k] = leftArr[i];
				i++;
			} else {
				num[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while (i < leftArrSize) {
			num[k] = leftArr[i];
			i++;
			k++;
		}
		while (j < rightArrSize) {
			num[k] = rightArr[j];
			j++;
			k++;
		}
	}
}
