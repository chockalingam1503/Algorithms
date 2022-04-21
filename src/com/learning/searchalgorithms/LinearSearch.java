package com.learning.searchalgorithms;

public class LinearSearch {

	public static int linearSearch(int[] noArray, int element) {
		int index = 0;
		for (int i : noArray) {
			if (i == element) {
				return index;
			}
			index++;
		}

		return -1;

	}

	public static void main(String[] args) {

		int[] myIntArray = { 44, 7, 8, 1, 6, 2, 3 };
		System.out.println("Index of the element is :  " + linearSearch(myIntArray, 8));
		int index=linearSearch(myIntArray, 8);
		System.out.println(index>=0 ? "Element is found in index : "+index : "Element is not found");		
	}
}
