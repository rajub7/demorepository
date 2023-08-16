package com.javabasic;

import java.util.Arrays;

public class SortGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=1847423678;
    
    int arr[]=new int[10];
    int i=0;
    while(num>0) {
    	arr[i]=num%10;
    	num=num/10;
    	i++;
    	
    }
    Arrays.sort(arr);
    for (int j = 0; j < arr.length; j++) {
		System.out.println(arr[j]);
		
	}
    
	}

}
