package com.interviewjavaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sort_element_reverse {
  public static void main(String[] args) {
	int arr[]={1,3,35,8,98,67};
	System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	List<Integer> li= Arrays.stream(arr).boxed().collect(Collectors.toList());
	  Collections.reverse(li);
	System.out.println(li);
	
	
	Integer arr1[]={1,3,35,8,98,67};
	List<Integer>li1=Arrays.asList(arr1);
	Collections.reverse(li1);
	System.out.println(li1);
}
}
