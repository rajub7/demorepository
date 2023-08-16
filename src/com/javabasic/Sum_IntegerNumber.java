package com.javabasic;

public class Sum_IntegerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=549879;
        int sum=0;
        while(num>0) {
        	sum=sum+num%10;
        	num=num/10;
        	
        }
        System.out.println(sum);
	}

}
