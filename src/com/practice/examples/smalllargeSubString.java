package com.practice.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class smalllargeSubString {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        
        int length = s.length();
        
       List<String> lstr = new ArrayList<String>();
        
        for(int i=0;i<=length-1;i++){
        	
        	for(int j=i+k;j<length;j++) {
        		
               lstr.add(s.substring(i,j));
               
                break;
        	}
        	 System.out.println(lstr);
        	 Object[] a = lstr.toArray();
        	 
        	 Arrays.sort(a);
        	 
        	 for(Object b : a) {
        		 
        		 System.out.println(b);
        	 }
             
            
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }
    
    static boolean isAnagram(String a, String b) {
        // Complete the function
    	a=a.toLowerCase();
        b=b.toLowerCase();
        int count = 0;
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            
            count+=a.charAt(i);
            System.out.println((int)a.charAt(i));
            
        }
        
        for(int i=0;i<b.length();i++){
            
            count-=b.charAt(i);
            System.out.println("\n"+(int)b.charAt(i));
            
        }
        
        return (count == 0);
        
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        //System.out.println(getSmallestAndLargest(s, k));
        String a = "xyzw";
        String b = "xyxy";
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
