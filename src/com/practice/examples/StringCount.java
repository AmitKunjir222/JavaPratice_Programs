package com.practice.examples;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I love my Country1245";
		char ch[] = test.toCharArray();
		int size = ch.length;
		int letters=0;
		
		for(int i=0;i<size;i++) {
			
			if(Character.isSpaceChar(ch[i])) {
				
				letters++;
			}
			
		}
		System.out.println(letters);
	}

}
