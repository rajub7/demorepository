package com.oops;

final public class Final {
	int x=5;
	int y=6;
	
	final int a;
	final int b;
	  final static int h=70;
	  Final(){
		 a=20;
		 b=20;
	  }
      final static void m1(final int x){
    	  
    	  System.out.println(x);
    	  
        System.out.println("final excute");	
        }
      final void m1(){
    	  System.out.println(a);
    	  System.out.println(b);
    	 System.out.println("final instance "); 
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final Final f= new Final();
	  System.out.println(f.x*f.y);
	  f.x=24;
	  f.y=67;
	  System.out.println(f.x+f.y);
		f.m1();
        m1(7);
        m1(89);
        
	}

}
