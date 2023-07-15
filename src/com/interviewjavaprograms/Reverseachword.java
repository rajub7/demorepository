package com.interviewjavaprograms;

public class Reverseachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str="hello this raju";
          String [] arr=str.split(" ");
          String rev="";
          for (int i = arr.length-1; i >= 0; i--) {
			 rev=rev+arr[i]+" ";
		}
         
         System.out.println(rev+" ");
          
	}

}
