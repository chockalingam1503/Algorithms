package com.learning.oddoccurancesinarray;

import com.learning.sortingalgorithms.BubbleSort;

public class OddOcuurance {

	public static void main(String[] args) {

		int[] nArray = {1,  9, 3, 8, 3, 9, 8, 89, 67, 67, 89, 4, 4, 61 , 61 };

		nArray = BubbleSort.bubbleSort(nArray);

		System.out.println(findOddOccurance(nArray));

	}

	public static int findOddOccurance(int[] noArray) {

		for (int i = 0; i < noArray.length; i += 2) {

			if (i != noArray.length - 1) {
				if (noArray[i] != noArray[i + 1]) {
					return noArray[i];
				}
			} else {
				return noArray[i];
			}
		}

		return -1;

	}

}
