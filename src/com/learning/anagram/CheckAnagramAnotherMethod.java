package com.learning.anagram;

import java.util.Arrays;
import java.util.Iterator;

public class CheckAnagramAnotherMethod {

	public static void main(String[] args) {

		String word = "jawva2bloga";
		String anagram = "aj2vabgolw";

		System.out.println("java2blog and aj2vabgol are anagrams :" + isAnagramUsingArraySort(word, anagram));
		
		System.out.println("java2blog and aj2vabgol are anagrams :" + isAnagramUsingAscii(word, anagram));

	}

	public static boolean isAnagramUsingArraySort(String word, String anagram) {

		String sortedWord = sortChars(word);
		String sortedAnagram = sortChars(anagram);

		return sortedWord.equals(sortedAnagram);
	}

	public static String sortChars(String word) {
		char[] wordArr = word.toLowerCase().toCharArray();
		Arrays.sort(wordArr);
		return String.valueOf(wordArr);
	}
	
	public static boolean isAnagramUsingAscii(String word, String anagram) {

		word=word.toLowerCase();
		anagram=anagram.toLowerCase();
		int count1=0;
		int count2=0;
		
		if(word.length()!=anagram.length()) {
			return false;
		}
		for (int i = 0; i < word.length(); i++) {

			count1 = count1 + word.charAt(i);
			count2 = count2 + anagram.charAt(i);

		}
		
		
		return (count1==count2);
	}
}
