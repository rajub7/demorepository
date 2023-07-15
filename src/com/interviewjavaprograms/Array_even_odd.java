package com.interviewjavaprograms;

public class Array_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int arr[]={1,58,58,99,56,54,32};
	    int even=0;
	    int odd=0;
      for (int i = 0; i < arr.length; i++) {
		if (arr[i]%2==0) {
			even++;
		} else {
         odd++;
		}
	}
      System.out.println(even);
      System.out.println(odd);
	}

}
