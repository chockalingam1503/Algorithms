package com.learning.recursiveaddtionofarrays;

public class RecursiveArrayAddtion {
	
	
	public static int sum(int [] nArray , int length) {
		
		 if(length==1) {
			 return nArray[0];
		 }
		 int s = sum(nArray,length-1);
		 s=s+nArray[length-1];
		
		return s;
		
	}
	
	
	public static void main(String[] args) {
		
		int [] n = { 5,7,2,8,9,10};
		
		System.out.println(sum(n, n.length) );
		
	}

}
