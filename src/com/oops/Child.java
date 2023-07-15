package com.oops;

public class Child extends Intermediate {
	int  a=4;
	int c=6;
	
    void m1(){
    	int d=67;
    	int a=5;
    	super.m1();
    	System.out.println(super.a);
    	System.out.println(this.a);
    	System.out.println(a);
    	m2();
    	
	 System.out.println("child class"); 
	  
    }
   public static void main(String[] args) {
	Child c= new Child();
	c.m1();
}
}
