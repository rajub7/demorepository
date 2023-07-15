package com.oops;

public class Intermediate extends Parent {
	 int a=45;
	 int d=56;
	
         void m1(){
        	 int a=20;
        	 int c=70;
        	 super.m1();
        	 System.out.println(this.a);
        	 System.out.println(super.a);
        	 System.out.println("intermediate");
         }
         void m2(){
        	 int d=59;
        	 int f=78;
        	 super.m2();
        	 System.out.println("intermediate m2");
         }
	
}
