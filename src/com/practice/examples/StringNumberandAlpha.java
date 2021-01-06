package com.practice.examples;

public class StringNumberandAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a[] = {"Java","1234","Java123","Test","345"};
		
		String alphareg = "^[a-zA-Z][^0-9]+$";
		String numreg = "^[0-9]+$";
		String alphanumreg = "^[a-zA-Z0-9][^a-zA-Z][^0-9]+$";
		
		int aplha=0,num = 0,aplhanum=0;
		
		for(String b : a) {
			System.out.println(b.substring(0,1));
		if(b.matches(alphanumreg)) {
				aplhanum++;
				System.out.println("Alphanum "+b);
		}
		else if(b.matches(numreg)) {
				num++;
				System.out.println("Only Num "+b);
			}
			else if(b.matches(alphareg)) {
				aplha++;
				System.out.println("Only Alpha "+b);
			}
			
			
			
		}
		System.out.println("Number of Strings "+aplha);
		System.out.println("Number of AlphaStrings "+aplhanum);
		System.out.println("Number of num "+num);
	}

}
