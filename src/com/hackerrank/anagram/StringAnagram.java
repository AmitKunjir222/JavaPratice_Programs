package com.hackerrank.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringAnagram {

	public static void anagram() {

		String a[] = {"cba","pqr"};


		List<String> dictionary = Arrays.asList(a);
		List<String> query = Arrays.asList("bca","qpr","abc");

		for(int i=0;i<dictionary.size();i++){ 
			int count = 0;
			for(int j=0;j<query.size();j++){

				if(dictionary.get(i).length()==query.get(j).length()) {
					System.out.print("For dic "+dictionary.get(i)+"        ");
					System.out.print("For query "+query.get(j)+"\n");
					char ch1[] = dictionary.get(i).toCharArray();
					// System.out.println("Before sort"+ch1[i]);
					Arrays.sort(ch1);

					char ch2[] = query.get(j).toCharArray();
					Arrays.sort(ch2);
					if(Arrays.equals(ch1, ch2)) {
						System.out.println("Anagram");
						count+=1;
					}


				}



			}
			System.out.println(count);
		}




	}

	public static void main(String args[]) {

		anagram();



	}

}
