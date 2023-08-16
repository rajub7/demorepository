package com.javabasic;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		int b=30;
	// with out using temp variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		
	// using temp variable
		
		int c=a;
		  a=b;
		  b=c;
		  System.out.println(a+" "+b);
		    

	}

}
