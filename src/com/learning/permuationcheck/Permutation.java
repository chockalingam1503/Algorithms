package com.learning.permuationcheck;

import com.learning.sortingalgorithms.BubbleSort;

public class Permutation {
	
	{
		System.out.println("i am empty");
	}
	

	
	Permutation() {
		System.out.println("i am No args cons");
	}
	
	static {
		System.out.println("i am static ");
	}
	
	public static void main(String[] args) {

		int[] nArray = {1,2,3,5,4,9,8,7,6,0,10};

		nArray = BubbleSort.bubbleSort(nArray);

		Permutation p = new Permutation();
		System.out.println(p.validatePerm(nArray));

	}
	
	
	public  int validatePerm(int [] nArray) {
		
		for (int i = 0; i < nArray.length-1; i++) {
			
			if(nArray[i]+1==nArray[i+1]) {
				if(i+1==nArray.length-1) {
					return 1;
				}
				continue;
			}else {
				break;
			}
			
		}
		
		
		return -1;
		
	}
	
	
}
