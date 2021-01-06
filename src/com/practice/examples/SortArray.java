package com.practice.examples;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {6,4,1,2,10};
		int temp;
		
		int size=a.length;
		
		int max = 0;
		
		for(int i=0;i<size;i++) {
			
			if(max<a[i]) {
				
				max=a[i];
				
			}
			
		}
		System.out.println(max);
		
for(int i=0;i<size;i++) {
	for(int j=i+1;j<size;j++) {
		
		if(a[j]>a[i]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			System.out.println(a[i]);
			
		}
		
	}
			
		}
for(int b : a)
System.out.print(b);

	}

}
