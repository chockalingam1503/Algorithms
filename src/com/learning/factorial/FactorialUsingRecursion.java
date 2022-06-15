package com.learning.factorial;

public class FactorialUsingRecursion {

	public static int findFactorial(int n) {

		if (n < 0) {
			return -1;
		}
		if (n == 1 || n == 0) {
			return 1;
		}
		System.out.println(n);
		return n * findFactorial(n - 1);

	}

	public static void main(String[] args) {
		System.out.println(findFactorial(123));
	}

}
