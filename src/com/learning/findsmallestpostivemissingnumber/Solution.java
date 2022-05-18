package com.learning.findsmallestpostivemissingnumber;

import com.learning.sortingalgorithms.BubbleSort;

public class Solution {

	public static int solution(int[] nArray) {

		nArray = BubbleSort.bubbleSort(nArray);

		int sequence = 1;
		for (int i : nArray) {

			if (i > 0) {

				if (sequence != i) {
					return sequence;
				} else
					sequence++;
				if (i == nArray.length - 1) {
					return i + 1;
				}

			}

		}

		return -1;

	}

	public static void main(String[] args) {

		int[] nArray = { -4, -2, 2, 3, 4, 9, 8, 7, 6, 0, 10 };

		System.out.println(Solution.solution(nArray));

	}

}
