package com.vasanth.javaprograms.telusko.complex;

public class Searching {

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int target = 1;
		// int result = LinearSearch(num, target);
		// int result = BinarySearch(num, target);
		int result = BinarySearch(num, target, 0, num.length - 1);
		if (result != -1) {
			System.out.println("The target is in nums[" + result + "], and the target is: " + target);
		} else {
			System.out.println("The target is not found....");
		}

	}

//	public static int BinarySearch(int[] num, int target) {
//		int first = 0;
//		int last = num.length - 1;
//		while (first <= last) {
//			int mid = (first + last) / 2;
//			if (num[mid] == target) {
//				return mid;
//			} else if (num[mid] < target) {
//				first=mid+1;
//			} else {
//				last=mid-1;
//			}
//		}
//		return -1;
//	}

	public static int BinarySearch(int[] num, int target, int first, int last) {
		if (first <= last) {
			int mid = (first + last) / 2;
			if (num[mid] == target) {
				return mid;
			} else if (num[mid] < target) {
				return BinarySearch(num, target, mid + 1, last);
			} else {
				return BinarySearch(num, target, first, mid - 1);
			}
		}
		return -1;
	}

	public static int LinearSearch(int[] num, int target) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
