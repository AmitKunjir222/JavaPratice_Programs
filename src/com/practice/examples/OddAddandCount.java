package com.practice.examples;

public class OddAddandCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method1();
		method2();
		

	}
	public static void method1() {
		int count=0;
		int addition = 0;
		for(int i=1;i<=99;i=i+2) {
			
			System.out.println(i);
			
			count++;
			addition+=i;
			
		}
		System.out.println("Number of odd numbers are :"+count);
		System.out.println("Sum of odd numbers are :"+addition);
		
	}
	public static void method2() {
		int count=0;
		int addition = 0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
				
				count++;
				addition+=i;
			}
			
			
		}
		System.out.println("Number of odd numbers are :"+count);
		System.out.println("Sum of odd numbers are :"+addition);
		
	}
}
