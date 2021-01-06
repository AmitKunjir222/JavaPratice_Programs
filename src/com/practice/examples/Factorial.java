package com.practice.examples;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact=1;
		
		//System.out.print("Factrial is 0,1");
		
		for(int i =1;i<=5;i++) {
			
			fact = fact*i;
			System.out.println(fact);
		}
		
		System.out.println(recursion(5));
		
		

	}
	
	public static int recursion(int num) {
		
		while(num>0) {
			return num*(recursion(num-1));
		}
		return num;
		
	}

}
