package com.learning.fibonacci;

public class Fibonnacii {

	public static void printFibonnacii(int n) {

		int n1 = 0, n2 = 1;

		do {

			System.out.println(n1);
			System.out.println(n2);

			n1 = n2 + n1;
			n2 = n2 + n1;

		} while (n2 <= n);

	}
	
	
	public static int fibonnaci(int n) {
		
		System.out.println(n);
		if(n==0 || n==1 ) {
			return n;
		}
		
		return fibonnaci(n-1)+fibonnaci(n-2);
		
		

	}

	public static void main(String[] args) {
		System.out.println(fibonnaci(9));
	}

}
