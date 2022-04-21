package com.learning.searchalgorithms;

import com.learning.sortingalgorithms.BubbleSort;

public class BinarySearch {

	public static int binarySearch(int[] noArray, int element) {

		int leftindex = 0;
		int rightIndex = noArray.length;
		int middleIndex ;

		do {
			middleIndex = (leftindex+ rightIndex)/ 2;
			if (noArray[middleIndex] == element) {
				return middleIndex;
			}

			if ( element > noArray[middleIndex]) {
				leftindex = middleIndex;
			}

			if ( element< noArray[middleIndex]) {
				rightIndex = middleIndex;
			}

		} while (rightIndex != leftindex);

		return -1;
	}

	public static void main(String[] args) {

		int[] myIntArray = { 44, 7, 8, 1, 6, 2, 3 };
		System.out.println("sorted Array is");
		for (int i :BubbleSort. bubbleSort(myIntArray)) {
			System.out.println(i);
			
		}
		int elementTobeFound=44;
		System.out.println("Index of the element is :  " + binarySearch(BubbleSort.bubbleSort(myIntArray), elementTobeFound));
		int index = binarySearch(BubbleSort.bubbleSort(myIntArray), elementTobeFound);
		System.out.println(index >= 0 ? "Element is found in index : " + index : "Element is not found");
	}

}
