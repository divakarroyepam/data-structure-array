package com.epam.datastructure.array;

public class DutchFlagProblemAlgo {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 1, 0, 0, 1, 0, 2, 0, 2, 1, 0 };
		int start = 0;
		int mid = 0;
		int end = arr.length - 1;

		while (mid <= end) {
			//We can use switch cases in place of if-else condition
			if (arr[mid] == 0) {
				swap(start, mid, arr);
				start++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else if (arr[mid] == 2) {
				swap(end, mid, arr);
				end--;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

	private static void swap(int start, int mid, int[] arr) {
		int temp = arr[mid];
		arr[mid] = arr[start];
		arr[start] = temp;
	}

}
