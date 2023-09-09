package com.Arrays;

import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {

		
	String	vowels="rajubandri";
	String str= vowels.toLowerCase();
	
	char[] arr= str.toCharArray();
	boolean flag=false;
	int count=0;
	for (int i = 0; i < arr.length; i++) {
		  char ch=arr[i];
		  
		if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o') {
			flag=true;
			count++;
		}
		
	}
  
  System.out.println(count);
  
  if(flag) {
	  
	  System.out.println("vowels found");
  }
  
  String str2= "rat";
	String str1="cat";
	
	char []arr2=str2.toCharArray();
 
	char[] arr1=str1.toCharArray();
	
	Arrays.sort(arr2);
	Arrays.sort(arr1);
	
	if(Arrays.equals(arr2, arr1)) {
		System.out.println("anagram");
	}
	else {
		System.out.println("not anagram");
	}

  
  
  
  
  
	}
		

}
