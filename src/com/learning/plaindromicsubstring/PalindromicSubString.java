package com.learning.plaindromicsubstring;

public class PalindromicSubString {
	
	
	public static String findPalindromicSubString(String text) {
		String str = null;
		String palindrome="";
		for (int i = 0; i <text.length(); i++) {
			
			for (int j = i+2; j<text.length();j++)  {
				str= text.substring(i, j);
				
				StringBuffer sb = new StringBuffer(str);
				
				if(str.equals(sb.reverse().toString())) {
					
				 if(str.length()>palindrome.length()) {
						palindrome=str;
					}
				}
			}
			
		}
	
		return palindrome;
	}
	
	public static void main(String[] args) {
		System.out.println(findPalindromicSubString("sissssmadammissmam"));
	}

}
