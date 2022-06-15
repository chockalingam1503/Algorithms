package com.learning.smallestpostiveinteger;

public class SmallestMissingPositiveInteger {

	public static int smallestMissingPositiveInteger(int[] A) {

		A=bubbleSort(A);

		int indexOfOne = -1;
		for (int i = 0; i < A.length; i++) {

			if (A[i] == 1) {
				indexOfOne = i;
				break;
			}

		}

		if (indexOfOne == -1) {
			return 1;
		}
		int lookFor =1;
		for (int i = indexOfOne; i < A.length; i++) {
			
		
			if (A[i] != lookFor ) {
				return lookFor;
			}
			lookFor++;
		}

		return A[A.length - 1] + 1;

	}
	
	
	public static int[] bubbleSort(int[] numArray) {

		for (int i = 0; i < numArray.length; i++) {

			for (int j = i + 1; j < numArray.length; j++) {
				if (numArray[i] > numArray[j]) {
					int temp = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = temp;
				}
			}

		}

		return numArray;

	}

	public static void main(String[] args) {

		int n[] = { -1, -3, 1 ,0 ,2 ,6};
		System.out.println(smallestMissingPositiveInteger(n));
	}

}
