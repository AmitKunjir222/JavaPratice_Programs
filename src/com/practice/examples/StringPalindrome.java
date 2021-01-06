package com.practice.examples;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = "nan";
		boolean flag = method1(original);
		
		if(flag) {
			System.out.println("Palindrome");
			
		}
		else {
			System.out.println("Not a palindrome");
		}
		method2(original);
		
		
		

	}

	public static boolean method1(String str) {
		
		int size = str.length();
		int j = size-1;
		
		
		for(int i=0;i<size/2;i++) {
			
			if(str.charAt(i)!=str.charAt(j-i)) {
				return false;
			}
			
		}
		return true;
	}
	
	public static void method2(String str) {
		
		int size = str.length();
		String temp = "";
		
		for(int i=0;i<size;i++) {
			
		temp=str.charAt(i)+temp;
			
			
	}
		if(temp.equals(str)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
}
}
