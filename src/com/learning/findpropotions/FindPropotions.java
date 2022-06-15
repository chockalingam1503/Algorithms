package com.learning.findpropotions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindPropotions {

	public static void findPropotions(int[] nArray) {

		int postiveCount = 0;
		int negtaiveCount = 0;
		int zeroCount = 0;
		for (int i : nArray) {

			int dummy = i > 0 ? postiveCount++ : i < 0 ? negtaiveCount++ : zeroCount++;
		}

		System.out.println(String.format("%6f", (double) postiveCount / nArray.length));
		System.out.println(String.format("%6f", (double) negtaiveCount / nArray.length));
		System.out.println(String.format("%6f", (double) zeroCount / nArray.length));
	}
	
	public static void findPropotions(List<Integer> arr) {

		int postiveCount = 0;
		int negtaiveCount = 0;
		int zeroCount = 0;
		for (int i : arr) {

			int dummy = i > 0 ? postiveCount++ : i < 0 ? negtaiveCount++ : zeroCount++;
		}
		
//		arr.stream().forEach(i-> { int dummy =i > 0 ? postiveCount++ : i < 0 ? negtaiveCount++ : zeroCount++;
//		
//		});
	

		System.out.println(String.format("%6f", (double) postiveCount / arr.size()));
		System.out.println(String.format("%6f", (double) negtaiveCount /  arr.size()));
		System.out.println(String.format("%6f", (double) zeroCount /  arr.size()));
	}

	public static void main(String[] args) {

		int[] n = { -4, 3, -9, 0, 4, 1 };
		
		List<Integer> arr = new ArrayList<Integer>();
		
		for (int i : n) {
			
			arr.add(i);
			
		}
		

		findPropotions(arr);

	}

}
