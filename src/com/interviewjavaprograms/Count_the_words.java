package com.interviewjavaprograms;

import java.util.Scanner;

public class Count_the_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /* System.out.println("enter string");
   Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();*/
   String str ="welcome to java course";  
   int size=str.length();
   System.out.println(size);
   int count = 1;
   for (int i = 0; i <size-1; i++) {
	  if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')){
		  
		 count++;
		
	  }
       }
   System.out.println(count);
     }
   }