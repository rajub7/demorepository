package com.javabasic;

public class PrimeNumbers100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		
      for (int i = 1; num<100; i++) {
    	  int count=0;
		for (int j = 1; j <=i; j++) {
			if(i%j==0) {
				count++;
			}
			
		}
		if(count==2) {
			System.out.println(i);
			num++;
		}
		
	}
	}

}
