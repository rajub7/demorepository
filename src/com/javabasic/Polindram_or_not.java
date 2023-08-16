package com.javabasic;

public class Polindram_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 43034;
		int temp=num;
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		if(temp==rev) {
			System.out.println("this is polindram");
		}
		else {
			System.out.println("this is not polindram");
		}

	}

}
