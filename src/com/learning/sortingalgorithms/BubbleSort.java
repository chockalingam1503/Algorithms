package com.learning.sortingalgorithms;

public class BubbleSort {

	public static int[] bubbleSort(int[] numArray) {

		for (int i = 0; i < numArray.length; i++) {

			for (int j = i + 1; j < numArray.length; j++) {
				if (numArray[i] > numArray[j]) {
					int temp = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = temp;
				}
			}

		}

		return numArray;

	}

	public static void main(String[] args) {
		int[] myIntArray = { 44, 7, 8, 1, 6, 2, 3 };
		System.out.println("Sorted array is : ");
		int[] sortedArray = bubbleSort(myIntArray);
		for (int i : sortedArray) {
			System.out.println(i);

		}
	}

}
