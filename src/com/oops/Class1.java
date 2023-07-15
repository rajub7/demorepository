package com.oops;

public class Class1 {
     
	void m1(){
		int roll=43;
		String name="raju";
	    double percentage=75.65;
		System.out.println("roll:"+roll);
		System.out.println("name:"+name);
		System.out.println("percentage:"+percentage);

	}
	String[] m2(){
		 
		String[]arr={"raju","rani","subhangi","cherry"};
		  for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		return arr;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Class1 c=new Class1();
       c.m1();
	}

}
