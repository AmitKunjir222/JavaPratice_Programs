package com.practice.examples;

public class FibonicciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n1 = 0;
		int n2=1;
		//System.out.println("Fibonicci is 0,1");
		for(int i=1;i<=5;i++) {
			int temp = n1+n2;
			n1=n2;
			n2=temp;
			System.out.println(temp);
		}
		
	}

}
