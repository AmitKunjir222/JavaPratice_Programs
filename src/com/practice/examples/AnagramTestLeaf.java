package com.practice.examples;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramTestLeaf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Take first String from User
		System.out.println("Enter first String:");
		String first = sc.next();
		
		//Take Second String from User
		System.out.println("Enter second String:");
		String second = sc.next();
		checkanagram(first,second);
		
		

	}
	
	public static void checkanagram(String first,String second) {
		
		if(first.length()==second.length()) {
			
			char a[]=first.toCharArray();
			Arrays.sort(a);
			char b[]=second.toCharArray();
			Arrays.sort(b);
			
			if(Arrays.equals(a, b)) {
				System.out.println("Both the Strings are Anagram");
			}
			else {
				System.out.println("Both the Strings are not Anagram");
			}
		}
		else {
			System.out.println("Both the Strings are not Anagram");
		}
		
		
	}

}
