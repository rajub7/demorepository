package com.javabasic;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int temp=num;
		int r=0;
		int cube=0;
		
		while(num>0) {
		 r=num%10;
		 cube=cube+(r*r*r);
		 num=num/10;
			
		}
       if(cube==temp) {
    	   System.out.println("Armstrong number");
       }else {
    	   System.out.println("not Armstrong number");
       }
	}

}
