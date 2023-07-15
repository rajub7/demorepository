package com.interviewjavaprograms;

public class Prime_100 {

	public static void main(String[] args) {
		
		int num=2;
		int count=0;
		
		for (int i = 1; count <100; i++) {
		 int temp=0;
			for (int j = 1; j <=i; j++) {
				if(i%j==0){
					temp++;
				}
			}
				if(temp==2){
					System.out.println(i);
					count++;
				}
			
			}
		}	
    }
/*		for (int i = 2; i <num; i++) {
			if(num%i==0){
				count++;
			}	
		}
		if(count==2){		
			System.out.println("is prime");
		}
		
		
	int tem=0;
		for (int i = 1; i <=100; i++) {
			int count1=0;
			for (int j = 1; j <=i; j++) {
				if(i%j==0){
					count1++;
				}	
			
			}
			if(count1==2){
				System.out.println(i);
			}	
		} */
		
		
	
