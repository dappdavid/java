package com.algos.sort;

public class MergeSort {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 1, 6, 8, 5, 3, 7 };

		mergeSort(arr, arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

	// Write a Java program that illustrates merge sort
	public static void mergeSort(int[] arr, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] left = new int[mid];
		int[] right = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		for (int i = mid; i < n; i++) {
			right[i - mid] = arr[i];
		}
		mergeSort(left, mid);
		mergeSort(right, n - mid);

		merge(arr, left, right, mid, n - mid);
	}

	public static void merge(int[] arr, int[] left, int[] right, int l, int r) {

		int i = 0, j = 0, k = 0;
		while (i < l && j < r) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		while (i < l) {
			arr[k++] = left[i++];
		}
		while (j < r) {
			arr[k++] = right[j++];
		}
	}

	// How do you sort an array in Java
	private static void sortAnArray() {
		// TODO Auto-generated method stub

	}

}
