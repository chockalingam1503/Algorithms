package com.learning.frogjump;

public class FrogJump {
	
	
	public static void main(String[] args) {
		
		System.out.println(fromjumpCount(10,70,30));
	}
	
	
	public static int fromjumpCount(int X, int Y, int D) {
		
		int count = (Y-X)/D;;
		
		if((Y-X)%D>0) {
			count++;
		}
		
		
		
		return count;
	}

}
