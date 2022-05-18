package com.learning.uniquestring;

import java.util.HashSet;
import java.util.Optional;

public class HasAllUniqueChars{
	
	
public static boolean hasAllUniqueCharsUsingHashSet(String text) {
	
	if((Optional.ofNullable(text)).isEmpty()) {
		return false;
	}
	HashSet<Character> charSet= new HashSet<Character>();
	for (int i = 0; i < text.length(); i++) {
		char ch = text.charAt(i);
		
		if(!charSet.add(ch)) {
			return false;
		}
		
	}
	
	
	return true;
}

public static boolean hasAllUniqueCharsUsingStringFunctions(String text) {
	
	if((Optional.ofNullable(text)).isEmpty()) {
		return false;
	}
	for (int i = 0; i < text.length(); i++) {
		
		
		if(text.indexOf(text.charAt(i))!=text.lastIndexOf(text.charAt(i))) {
			return false;
		}
		
	}
	
	
	return true;
}




public static void main(String[] args) {
	 
	  System.out.println("java2blog has all unique chars : "+ hasAllUniqueCharsUsingHashSet("java2blog"));
	  System.out.println("Apple has all unique chars : "+ hasAllUniqueCharsUsingHashSet("apple"));
	  System.out.println("index has all unique chars : "+ hasAllUniqueCharsUsingHashSet("index"));
	  System.out.println("world has all unique chars : "+ hasAllUniqueCharsUsingHashSet("world"));
	  System.out.println("world has all unique chars : "+ hasAllUniqueCharsUsingHashSet(null));
	  System.out.println("world has all unique chars : "+ hasAllUniqueCharsUsingHashSet("c  "));
	  
	  System.out.println("-------");
	  
	  System.out.println("java2blog has all unique chars : "+ hasAllUniqueCharsUsingStringFunctions("java2blog"));
	  System.out.println("Apple has all unique chars : "+ hasAllUniqueCharsUsingStringFunctions("apple"));
	  System.out.println("index has all unique chars : "+ hasAllUniqueCharsUsingStringFunctions("index"));
	  System.out.println("world has all unique chars : "+ hasAllUniqueCharsUsingStringFunctions("world"));
	  System.out.println("world has all unique chars : "+ hasAllUniqueCharsUsingStringFunctions(null));
	  System.out.println("world has all unique chars : "+ hasAllUniqueCharsUsingStringFunctions("c  "));
	 }

}