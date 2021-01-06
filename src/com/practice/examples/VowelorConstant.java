package com.practice.examples;

import java.util.Scanner;

public class VowelorConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a char to check:");
		
		String ch = sc.nextLine();
		
		if (ch.matches("[aeiou]")) {
			System.out.println("It is a vowel");
			
		}
		else {
			System.out.println("It is a Constant");
		}

	}

}
