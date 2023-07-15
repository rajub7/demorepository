package com.interviewjavaprograms;

import java.util.Arrays;

public class Reverse_of_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="welcome my world of love";
  // method 1 
   char[] arr=str.toCharArray();
   
   for (int i = arr.length-1; i > 0; i--) {
	System.out.print(arr[i]);
}
 // method 2    
   String[]arr1= str.split(" ");
   System.out.println(Arrays.toString(arr1));
   String rev="";
   for(String st:arr1){
	  String revword="";
	   for (int i = st.length()-1; i>=0; i--) {
		revword=revword+st.charAt(i);
	}
	   rev=rev+revword+" ";
   }
   System.out.println( "revers string"+"  "+rev); 
	}

}
