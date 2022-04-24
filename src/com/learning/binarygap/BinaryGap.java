package com.learning.binarygap;

public class BinaryGap {
	
	public static int solution(int N) {
		
		String binaryString = Integer.toBinaryString(N);
		//1000100;
		int finalCount=0;
		int zeroLength=0;
		for(int i=0;i<binaryString.length();i++) {
			
			if(binaryString.charAt(i)=='0') {
				zeroLength++;
			}else {
				
				if(zeroLength>finalCount) {
					finalCount=zeroLength;
				}
				zeroLength=0;
			}
			
			if((i==binaryString.length()-1)&&finalCount==0&&binaryString.charAt(i)==1) {
				finalCount=zeroLength;
			}
			
		}
		
		return finalCount;
		
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println( solution(529));
	}

}
