package com.practice.examples;

public class ReverseString {
	
	public static void main(String args[]) {
		
			  String str = "The quick brown fox";
			  reversedString(str);
			  System.out.println("Reversed String is "+str);
			  System.out.println("Reversed String from Method 2 "+reverseMethod2(str));
			  System.out.println("Reversed String from Method 3 "+method3(str));

			  
		
	}
	
	public static String reversedString(String str) {
		
		char ch[] = str.toCharArray();
		  int size = ch.length;
		  for(int i=size;i>0;i--){
		    
		   System.out.print(ch[i]);
		    
		  }
		return str;
		  
		  }
	
	public static String method3(String str) {
		
		
		String reverse="";
		  int size = str.length();
		  for(int i=0;i<size;i++){
		    
		   reverse = str.charAt(i)+reverse;
		    
		  }
		return reverse;
		  
		  }
	
public static String reverseMethod2(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
		
}
	}
	


