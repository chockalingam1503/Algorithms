package com.learning.inplacereversechararray;

public class ReverseWordsInplace {

	public static String[] reverseWordsInplace(String[] wordArray) {

		int leftIndex = 0;
		int rightIndex = wordArray.length - 1;
		while (leftIndex != rightIndex && leftIndex != rightIndex + 1) {
			String temp = wordArray[leftIndex];
			wordArray[leftIndex] = wordArray[rightIndex];
			wordArray[rightIndex] = temp;
			leftIndex++;
			rightIndex--;
		}

		return wordArray;

	}

	public static void main(String[] args) {
		String[] wordArray = "I lobe my country".split(" ");
		wordArray = reverseWordsInplace(wordArray);

		for (String word : wordArray) {
			System.out.println(word);
		}
	}

}
