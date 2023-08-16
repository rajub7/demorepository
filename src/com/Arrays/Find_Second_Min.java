package com.Arrays;

import java.util.Arrays;

public class Find_Second_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {45,87,9,83,6,89,4,7};
		int temp;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j <arr.length; j++) {
				if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
	}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("smallest second number"+arr[1]);
			//System.out.println("largest second number"+arr[i]);
		}
 }
}
		
