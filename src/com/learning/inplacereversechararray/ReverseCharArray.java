package com.learning.inplacereversechararray;

public class ReverseCharArray {

	public static char[] reverseCharArray(char[] chArray) {

		int leftIndex = 0;
		int rightIndex = chArray.length - 1;
		while (leftIndex != rightIndex &&leftIndex != rightIndex+1) {
			char temp = chArray[leftIndex];
			chArray[leftIndex] = chArray[rightIndex];
			chArray[rightIndex] = temp;
			leftIndex++;
			rightIndex--;
		}

		return chArray;

	}

	public static void main(String[] args) {
		char[] charArray = "ca".toCharArray();
		charArray = reverseCharArray(charArray);

		for (char c : charArray) {
			System.out.println(c);
		}
	}

}
