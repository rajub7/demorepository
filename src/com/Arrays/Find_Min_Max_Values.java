package com.Arrays;

public class Find_Min_Max_Values {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int arr[]= { 12,45,78,56,43,98,21,65};
		   int  min=arr[0];
		   int max=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]<min) {
				 min=arr[i];
			}
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(min+"  "+max);
		
	}

}
