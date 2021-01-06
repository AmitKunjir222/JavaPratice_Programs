package com.practice.examples;
//feature branch
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[] = {"Java","Amit","Selenium","Java","Amit"};
		
		Method1(arr);
		Method2(arr);
Method3(arr);
Method4(arr);
	}
	
	public static void Method1(String arr[]) {
		
		int size = arr.length;
		
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i].equals(arr[j])) {
					
					System.out.println("Duplicate String is "+arr[j]);
				}
			}
			
			
		}
		
	}
	
public static void Method2(String arr[]) {
		
		int size = arr.length;
		Set<String> newset = new HashSet<String>();
		
		for(String name : arr) {
			
			if(newset.add(name)==false) {
				System.out.println("\n");
				System.out.println("Duplicate String using Method 2 is "+name);
				
			}
			else {
				newset.add(name);
			}
		}
				
	}

public static void Method3(String arr[]) {
	
	int size = arr.length;
	Map<String,Integer> newmap = new HashMap<String,Integer>();
	
	for(int i=0;i<size;i++) {
		
		if(newmap.containsKey(arr[i])) {
			
			newmap.put(arr[i],newmap.get(arr[i])+1);
			
		}
		else {
			
			newmap.put(arr[i],1);
			
		}
	}
	for(Map.Entry<String, Integer> set : newmap.entrySet()) {
		
		Integer count = set.getValue();
		if(count>1) {
			System.out.println(set.getKey());
		}
		
		
		
	}
			
}
public static void Method4(String nums[]) {
	
	int size=nums.length;
	
	 int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	for(String a : nums) {
		System.out.println("Method4"+a);
	}
	
}

}
