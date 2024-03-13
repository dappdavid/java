package com.algos.search;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 8, 9, 12, 21, 23, 35 };
		int numberToSearch = 35;
		int index = binarySearchIterative(arr, numberToSearch);

		if (index < 0)
			System.out.println("No such element found in array");
		else
			System.out.println(numberToSearch + " found at index " + index);

		int indexRecursive = binarySearchRecursive(arr, numberToSearch, 0, arr.length);
		if (indexRecursive < 0)
			System.out.println("No such element found in array");
		else
			System.out.println(numberToSearch + " found at index " + indexRecursive);
	}

	private static int binarySearchIterative(int arr[], int x) {

		int start = 0;
		int end = arr.length - 1;
		int mid;

		while (start <= end) {
			mid = (start + end) / 2;
			if (x < arr[mid])
				end = mid - 1;
			else if (x > arr[mid])
				start = mid + 1;
			else
				return mid;
		}
		return -1;
	}

	private static int binarySearchRecursive(int arr[], int x, int start, int end) {
		int mid = (start + end) / 2;
		if (end < start) {
			return -1;
		}
		if (x < arr[mid])
			binarySearchRecursive(arr, x, start, mid - 1);
		else if (x > arr[mid])
			binarySearchRecursive(arr, x, mid + 1, end);
		else if (x == arr[mid]) {
			return mid;
		}
		return mid;
	}

}
