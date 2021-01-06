package com.practice.examples;

public class ExtractNumfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Amit1K2";
		
		method1(str);
		
		

	}
	
	public static void method1(String str) {
		
		int addition=0;
		for(int i=0;i<str.length();i++) {
			
			if(Character.isDigit(str.charAt(i))) {
				Integer num = Character.getNumericValue(str.charAt(i));
				addition+=num;
				System.out.println(addition);
			}
			
		}
		
		
	}

}
