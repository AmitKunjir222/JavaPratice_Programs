package com.practice.examples;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for(int i=1;i<=100;i++) {
			int num = i;
			 flag= primenum(num);
			 if(flag==true) {
					System.out.println(i);
				}
				
		}
		
		
		
		
		
	}
	public static boolean primenum(int num) {
		
		for(int i=2;i<=num/2;i++) {
			
			if(num%i==0) {
				
				return false;
			}
			
			
		}
		return true;
		
		
		
		
	}

}
