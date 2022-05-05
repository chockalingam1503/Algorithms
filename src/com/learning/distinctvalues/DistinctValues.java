package com.learning.distinctvalues;

import java.util.Iterator;

import com.learning.sortingalgorithms.BubbleSort;

public class DistinctValues {

	public static void main(String[] args) {

		int[] nArray = { 1, 9, 3, 8, 3, 9, 8, 89, 67, 67, 89, 4, 4, 61, 61 };

		nArray = BubbleSort.bubbleSort(nArray);

		nArray = findDistinctArray(nArray);

		for (int i : nArray) {
			System.out.println(i);
		}

	}

	public static int[] findDistinctArray(int[] noArray) {

		int count = 0;
		int[] newArray = new int[noArray.length];
		for (int i = 0; i < noArray.length; i++) {

			if (i == 0) {
				newArray[count++] = noArray[i];
			} else if (i == noArray.length - 1) {
				if (noArray[i] > noArray[i - 1]) {
					newArray[count++] = noArray[i];
				}

			} else if (noArray[i] > noArray[i - 1]) {
				newArray[count++] = noArray[i];
			}

		}

		return newArray;

	}

}
