package com.practice.examples;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Random rand = new Random();
		
		for(int i=0;i<6;i++) {
			list.add(rand.nextInt(100));
		}
		
		
			foreachItr(list);	
		

	}

	
	public static void foreachItr(ArrayList<Integer> list) {
		
		list.forEach(int1->System.out.println(int1));
		
	}
	
	public static void foreachRemItr(ArrayList<Integer> list) {
		
		
		
	}
}
