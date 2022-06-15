package com.learning.mergetwosortedarrays;

import com.learning.sortingalgorithms.BubbleSort;

public class MergeTwoArrays {

	public static int[] solution(int[] firstArray, int[] secondArray) {

		int mergedArray[] = new int[firstArray.length + secondArray.length];

		int currentIndexMerged = 0;
		int firstArrayIndex = 0;
		int secondArrayIndex = 0;

		boolean firstArrayExhausted = false;
		boolean secondArrayExhausted = false;

		while (currentIndexMerged < mergedArray.length) {

			firstArrayExhausted = firstArrayIndex >= firstArray.length;
			secondArrayExhausted = secondArrayIndex >= secondArray.length;

			if (firstArrayExhausted & !secondArrayExhausted) {
				mergedArray[currentIndexMerged++] = secondArray[secondArrayIndex++];
				continue;
			} else if (!firstArrayExhausted & secondArrayExhausted) {
				mergedArray[currentIndexMerged++] = firstArray[firstArrayIndex++];
				continue;
			} else if (firstArrayExhausted && secondArrayExhausted) {
				currentIndexMerged++;
				continue;
			}

			if (firstArray[firstArrayIndex] < secondArray[secondArrayIndex]) {
				mergedArray[currentIndexMerged++] = firstArray[firstArrayIndex++];
			} else if (firstArray[firstArrayIndex] > secondArray[secondArrayIndex]) {
				mergedArray[currentIndexMerged++] = secondArray[secondArrayIndex++];
			} else {
				mergedArray[currentIndexMerged++] = secondArray[secondArrayIndex++];
			}

		}

		return mergedArray;

	}

	public static void main(String[] args) {

		int[] myArr1 = { 44, 7, 8, 1, 6, 2, 3, 3 };

		int[] myArr2 = { 43, 4, 9, 0, 5, 12, 45, 89, 2 };

		myArr1 = BubbleSort.bubbleSort(myArr1);
		myArr2 = BubbleSort.bubbleSort(myArr2);

		for (int i : solution(myArr1, myArr2)) {

			System.out.println(i);

		}
		;
	}

}
