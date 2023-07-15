package com.interviewjavaprograms;

public class Check_prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=41;
     int count=0;
     for (int i =1; i<=num; i++) {
		
    	 if(num%i==0){
    		 count++;
    	 }
	}
     if(count==2){
    	System.out.println("this is prime"); 
     }else{
    	System.out.println("this is not prime"); 
     }
     
    }}


