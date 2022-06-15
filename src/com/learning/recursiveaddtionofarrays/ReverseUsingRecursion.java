package com.learning.recursiveaddtionofarrays;

public class ReverseUsingRecursion {

	public static void openRussianDoll(int num) {

		if (num == 1) {
			System.out.println("All Dolls opend");
		} else {
			openRussianDoll(num - 1);
			System.out.println(num);
		}

	}
	

	public static int recursiveSum(int num) {

		if (num == 0) {
			return 0;
		} else {
			int sum =recursiveSum(num - 1);
			sum=sum+num;
			return sum;
			
		}

	}

	public static void main(String[] args) {

		openRussianDoll(7);
		System.out.println(recursiveSum(4));
	}
}
