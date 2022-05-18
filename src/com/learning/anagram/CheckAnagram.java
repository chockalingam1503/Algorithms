package com.learning.anagram;

public class CheckAnagram {

	public static boolean checkAnagram(String name1, String name2) {

		if (name1.length() == name2.length()) {

			char[] nameArray1 = bubbleSortCharArray(name1.toCharArray());
			char[] nameArray2 = bubbleSortCharArray(name2.toCharArray());

			int i = 0;
			for (char c : nameArray2) {
				if (c != nameArray1[i++]) {
					return false;
				}
			}
			return true;
		}

		return false;

	}

	public static char[] bubbleSortCharArray(char[] charArray) {

		for (int i = 0; i < charArray.length; i++) {

			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] > charArray[j]) {
					char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}

		}

		return charArray;

	}

	public static void main(String[] args) {

		System.out.println(checkAnagram("ANGEL", "ANGELA"));
	}

}
