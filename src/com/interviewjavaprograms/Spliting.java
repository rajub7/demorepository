package com.interviewjavaprograms;

import java.util.Arrays;

public class Spliting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="qedg technolagy primus bank";
   String[] str1=str.split(" ");
     String rev1=" ";
     String s="";
  for (String stg : str1) {
	  String revword=" ";
	for (int i = stg.length()-1; i>=0; i--) {
		revword=revword+stg.charAt(i);	
	}
	rev1=rev1+revword;
    s=rev1.trim();
	
}
  System.out.println(s);
  
  
  
     String[] arr= str.split(" ");
     System.out.println(Arrays.toString(arr));
      String rev="";
     
		for (int i = arr.length-1; i>=0; i--) {
			rev=rev+arr[i]+" ";
		}
	
     System.out.println(rev+" ");
     
     }
	}

