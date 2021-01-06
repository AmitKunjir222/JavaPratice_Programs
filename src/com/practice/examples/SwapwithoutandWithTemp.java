package com.practice.examples;

public class SwapwithoutandWithTemp {

	public static void main(String args[]) {
		
		withoutTemp(5, 9);
		withTemp(5, 9);
		
	}
	
	public static void withoutTemp(int first,int second) {
		
		
		System.out.println("Before swap first no. is "+first+" second no. is "+second);
		first = first+second; //5
		second = first - second;
		first = first-second;
		

		
		System.out.println("After swap first no. is "+first+" second no. is "+second);
		
	}
	
	public static void withTemp(int first,int second) {
		
		int temp=0;
		System.out.println("Using temp Before swap first no. is "+first+" second no. is "+second);
		temp = first;
		first=second;
		second = temp;
		
		
		System.out.println("Using temp After swap first no. is "+first+" second no. is "+second);
		
	}
	
	
}
