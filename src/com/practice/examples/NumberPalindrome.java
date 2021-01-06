package com.practice.examples;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number = 12166;
		int original = number;
		int newnum=0;
		
		while(number>0) {
			
			newnum = newnum*10 + (number%10);
			number = number /10;
			
		}
		System.out.println(newnum);
		if(original == newnum) {
			System.out.println("It is a palindrome number");
		}else {
			System.out.println("Not a palindrome number");
		}
		
	}

}
