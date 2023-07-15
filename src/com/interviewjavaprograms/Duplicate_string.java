package com.interviewjavaprograms;

import java.util.Arrays;

public class Duplicate_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1[]= {"flower","flown","fly","flown"};
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < str1.length; i++) {
			sb.append(str1[i]);
		}
		String st=sb.toString(); 
		System.out.println(st);
		
 //String str="ram  araot  treo nduty";
  char[]arr=  st.toCharArray();
	   int count = 0 ;
    for (int i = 0; i <arr.length; i++) {
	    count=1;
	for (int j = i+1; j <arr.length; j++) {
		if (arr[i]==arr[j]&&arr[i]!=' ') {
			
			count++;
			arr[j]='0';
		}
		}
	if (count>1&&arr[i]!='0') {
		System.out.print(arr[i]+ " ");
		System.out.println(count);
	}

    }
	}
}