package com.interviewjavaprograms;

public class Even_odd_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num=556738;
   int rev=0;
   int even=0;
   int odd=0;
   while (num>0) {
     rev=num%10;
     if (rev%2==0) {
		even++;
	}
     else{
     odd++;
     }
     num=num/10;
	}
   System.out.println(even);
   System.out.println(odd);
}
}