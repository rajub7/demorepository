package com.collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class Vector_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int []arr={1,4,3,5,6,7,6,7};
     int size=arr.length;
     int temp;
     int count = 0;
     System.out.println(Arrays.toString(arr));
     // method 1 
     for (int i = 0; i <size; i++) {
		for (int j = i+1; j <size; j++) {
			if(arr[i]>arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
;			}
		}
	}
     System.out.println(arr[size-1]);
     // methed find duplicates
     for (int i = 0; i <size; i++) {
	  for (int j = i+1; j <size; j++) {
		if (arr[i]==arr[j]) {
			count++;
			System.out.println(arr[j]);
		}
	}
	}
     System.out.println("duplicate values" +"  "+count);
     
     
     
     
    //method 2 
 /*    Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
      System.out.println(arr[size-1]);
    */  
      //method 3
     List<Integer> li= Arrays.stream(arr).boxed().collect(Collectors.toList());
     Collections.sort(li);
     System.out.println(li);
     Collections.reverse(li);
     System.out.println(li);
	}
	}
