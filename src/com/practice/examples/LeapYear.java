package com.practice.examples;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 2020;
		
		if(year%400==0 || (year%4==0 && year%100!=0)){
			
			System.out.println("Leap");
		}
		else {
			System.out.println("Not a leap");
		}
	}

}
