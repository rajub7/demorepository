package com.interviewjavaprograms;

import java.util.Arrays;

public class Sort_Elements_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int arr[]={1,58,58,99,56,56,54,32,32};
	    int temp=0;
	    
	    
	    for (int i = 0; i < arr.length; i++) {
			
	    	for (int j = i+1; j < arr.length; j++) {
	    		if(arr[i]>arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
	    		}
			}
		}
	 System.out.println(temp);
	    for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
