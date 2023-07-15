package com.interviewjavaprograms;

public class Armstrong {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =153;
		int r=num;
		int cube=0;
		int t=0;
		
	
		while(num>0){
		t=num%10;
		num=num/10;
		cube=cube+(t*t*t);
		}
		if(r==cube){
			System.out.println("armstrong number");
		}
		else{
			System.out.println("not armstrong");
		}
		}
	

}
