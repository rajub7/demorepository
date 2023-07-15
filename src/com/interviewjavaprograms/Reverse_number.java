package com.interviewjavaprograms;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=4554;
    int rev = 0;
     while (num>0) {
		rev=rev*10+num%10;
		num=num/10;
	}
    System.out.println(rev); 
    if(num==rev){
    System.out.println("this is polindram");
    }
    else{
    System.out.println("this is not polindram");	
    }
    StringBuffer sb=new StringBuffer(String.valueOf(rev));
    StringBuffer str= sb.reverse();
     System.out.println(str);
    
	}		   
}
