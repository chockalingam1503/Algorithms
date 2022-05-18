package com.learning.nonreaptedchar;

import java.util.Optional;

public class FindNonRepeatedChar {

	public static char findNonRepeatedChar(String text) {

		if((Optional.ofNullable(text)).isEmpty()) {
			return 0;
		}
		
		for (int i = 0; i < text.length(); i++) {

			char ch = text.charAt(i);

			int count = 0;
			for (int j = 0; j < text.length(); j++) {

				if (text.charAt(j) == ch) {
					++count;
				}

			}
			if (count == 1) {
				return ch;
			}
		}

		return 0;

	}
	
	public static char findNonRepeatedCharUsingIndex(String text) {
		
		if((Optional.ofNullable(text)).isEmpty()) {
			return 0;
		}
		for (int i = 0; i < text.length(); i++) {
			
			
			if(text.indexOf(text.charAt(i))==text.lastIndexOf(text.charAt(i))) {
				return text.charAt(i);
			}
			
		}
		
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		  System.out.println("java2blog first uniqe char: "+ findNonRepeatedChar("java2blog"));
		  System.out.println("Apple first uniqe char: "+ findNonRepeatedChar("apple"));
		  System.out.println("index first uniqe char: "+ findNonRepeatedChar("index"));
		  System.out.println("world first uniqe char: "+ findNonRepeatedChar("world"));
		  System.out.println("world first uniqe char: "+ findNonRepeatedChar(null));
		  System.out.println("world first uniqe char: "+ findNonRepeatedChar("c  "));
		  System.out.println("world first uniqe char: "+ findNonRepeatedChar(" c"));
		  
		  System.out.println("above is of order n to the power 2 ~~~~  below is of order n");
		  
		  System.out.println("java2blog first unique char: "+ findNonRepeatedCharUsingIndex("java2blog"));
		  System.out.println("Apple first uniqe char: "+ findNonRepeatedCharUsingIndex("apple"));
		  System.out.println("index first uniqe char: "+ findNonRepeatedCharUsingIndex("index"));
		  System.out.println("world first uniqe char: "+ findNonRepeatedCharUsingIndex("world"));
		  System.out.println("world first uniqe char: "+ findNonRepeatedCharUsingIndex(null));
		  System.out.println("world first uniqe char: "+ findNonRepeatedCharUsingIndex("c  "));
		  System.out.println("world first uniqe char: "+ findNonRepeatedCharUsingIndex(" c"));
		  
	}

}
