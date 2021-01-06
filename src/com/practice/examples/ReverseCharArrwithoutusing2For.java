package com.practice.examples;

public class ReverseCharArrwithoutusing2For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
		reverseString1(s);

	}
public static void reverseString(char[] s) {
        
        int size = s.length;
        char rev[] = new char[size];
        int j=0;
        for(int i=size-1;i>=0;i--){
           
                
                rev[j]=s[i];
            j++;
                
            
        }
        System.out.println(rev);
        
    }
public static void reverseString1(char[] s) {
    
    int size = s.length;
    int j=size-1;
    for(int i=0;i<=j/2;i++){
       
         s[i] = s[j-i];                  
        
    }
    System.out.println(s);
    
}
}
