package com.learning.panagram;

import java.util.Arrays;

public class Panagram {

	public static boolean isPanagram(String text) {

		char[] charArray = text.toLowerCase().replaceAll("[^a-z]", "").toCharArray();
		Arrays.parallelSort(charArray);

		int ascii = 97;
		int count = 0;
		for (char c : charArray) {

			if (count++ == 0 && c != ascii) {

				return false;
			}

			if (c == ascii) {

				continue;
			} else if (c == ascii + 1) {
				ascii++;
			} else {
				return false;
			}

		}

		return ((ascii == 122) ? true : false);

	}
	
	public static boolean isPanagramEfficientmethod(String text) {

		for (char c = 'a'; c <= 'z'; c++) {

			if (!text.contains(String.valueOf(c))) {
				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPanagramEfficientmethod("sshesssddddaaaaaaaaaaaaaaaa quck i brown fox jumps over he lazy dogzzzzzzzzzzzzzzz234"));
	}

}
