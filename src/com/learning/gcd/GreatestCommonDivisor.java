package com.learning.gcd;

import java.util.Iterator;

public class GreatestCommonDivisor {
	
	public static int findGreatestCommonDivisor(int num1, int num2) {
		
		
		if(num1<10 || num2 <10) {
			
			return -1;
		}
		
		int divisor =-1;
		for (int i = 2; i <=num1 || i<= num2; i++) {
			
			if(num1%i==0 && num2 %i==0) {
			if(i>divisor) {
				divisor=i;
			}
			}
			
		}
		
		return divisor;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(findGreatestCommonDivisor(12,30));
	}
	

}
