package com.learning.largestsubarray;

public class SumOfLargestSubArray {

	public static int findSumOfLargestSubArray(int[] numArray) {

		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < numArray.length; i++) {
			currentSum=0;
			for (int j = i; j < numArray.length; j++) {
				
				currentSum= currentSum+numArray[j];
				if(currentSum>maxSum) {
					maxSum=currentSum;
					System.out.println("Max : " +maxSum);
				}

			
			}

		}

		return maxSum;

	}
	
	public static void main(String[] args) {
		
		int [] n = {1000,10001,-2, -3, 4, -1, -2, 1, 5, -3 , -108,-109};
		System.out.println(findSumOfLargestSubArray(n));
	}

}
