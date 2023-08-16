package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayToCollection {
	
	public static void main(String[] args) {
		
		String[] arr={"raju","rani","tony","raja"};
		ArrayList<String>al=new ArrayList<>(Arrays.asList(arr));
		System.out.println("this is arraylist"+al);
		
		Set<String>s=new HashSet<>(Arrays.asList(arr));
		 System.out.println("this is set:"+s);
		 
		Map<String,Integer> st=new HashMap<>();
		
	    	for(int i=0;i<arr.length;i++) {
          st.put(arr[i], i);
		}
	    System.out.println("this is map"+st);	
		
		
		
	}

}
