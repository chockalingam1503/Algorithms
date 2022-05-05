package com.learning.sumoftwoelementsinarray;

public class Sumoftwoelements {

// [2,3,5,6,4,9,0]
// 9

//sort the array 0,2,3,5,6,9 ,

//9
//max and min   0 + 9 = 9

	public static void main(String[] args) {
		int nArray[] = { 2, 3, 5, 6, 4, 9, 0, 45, 78 };

		nArray = sortAnArray(nArray);

		for (int i : nArray) {
			System.out.println(i);
		}

		int n = 9;

		System.out.println(findMAtchingPairs(nArray, n));
		System.out.println(findMAtchingPairs(nArray, n));

	}

	public static int[] sortAnArray(int[] nArray) {

		for (int i = 0; i < nArray.length; i++) {
			for (int j = i + 1; j < nArray.length; j++) {

				if (nArray[i] > nArray[j]) {
					int temp = nArray[i];
					nArray[i] = nArray[j];
					nArray[j] = temp;

				}

			}
		}

		return nArray;

	}

	public static int findMAtchingPairs(int[] nArray, int n) {

		int count = 0;
		for (int i = 0; i < nArray.length; i++) {
			int n1 = nArray[i];

			if (n1 <= n) {
				for (int j = 0; j < nArray.length; j++) {

					if (i != j) {
						int sum = n1 + nArray[j];
						if (sum == n) {
							System.out.println("one of the pair is" + n1 + ":" + nArray[j]);
							count++;
						}
					}

				}
			}

		}

		if (count < 1) {
			return -1;
		} else {
			return 1;
		}

	}

	public static int findMAtchingPairsEfficient(int[] nArray, int sum) {

		int leftIndex = 0;
		int rightIndex = nArray.length - 1;
		int count = 0;
		while (leftIndex != rightIndex) {

			if (nArray[leftIndex] + nArray[rightIndex] > sum) {
				rightIndex--;

			} else if (nArray[leftIndex] + nArray[rightIndex] > sum) {
				leftIndex++;
			} else {
				count++;
				System.out.println("one of the pair is from efficient" + nArray[leftIndex] + ":" + nArray[rightIndex]);
			}
		}

		if (count < 1) {
			return -1;
		} else {
			return 1;
		}

	}

}
