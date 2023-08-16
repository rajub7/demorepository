package com.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]= {12,56,87,98,57,78,45,89,90};
    int swap=0;
   
   for (int i = 0; i < arr.length; i++) {
	   
	   for (int j = i+1; j <arr.length; j++) {
		   if(arr[i]>arr[j]) {
			   swap=arr[i];
			   arr[i]=arr[j];
			   arr[j]=swap;
			   
		   }
		
	}
	  
}
   for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}
   
   
	}

}
