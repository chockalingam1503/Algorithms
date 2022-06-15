package com.learning.recurssion;

public class Recurssion {

	public static int findSumOfAllDigits(int n) {

		if (n <= 0) {
			return 0;
		}
		return n % 10 + findSumOfAllDigits(n / 10);
	}

	public static void main(String[] args) {
		System.out.println(findSumOfAllDigits(1234));

		System.out.println(findPowerOfANumber(12, 2));
		
		System.out.println(convertToBinary(12));
	}

	public static int findPowerOfANumber(int number, int power) {

		if (power < 0) {
			return -1;
		}

		if (power == 0) {
			return 1;
		}

		return number * findPowerOfANumber(Math.abs(number), power - 1);

	}
	
	

	
	
	
	public static int convertToBinary(int n) {

		if (n == 0) {
			return 0;
		}
System.out.println(n);
		return (n % 2 + 10 * convertToBinary(n / 2));

	}
		

}
