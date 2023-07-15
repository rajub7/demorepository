package com.oops;

public class Methodoverloading {
	 void m1(){
		 int a=34;
		 System.out.println(a); 
     }
    void m1(int a){
    	System.out.println(a);
    }
    void m1(int a,String name){
    	System.out.println(a);
    	System.out.println(name);
    }
    void m1(String name,double rate){
    	System.out.println(name);
    	System.out.println(rate);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading md=new Methodoverloading();
		md.m1();
		md.m1(45);
		md.m1(89, "raju");
		md.m1("raju", 85.56);
	}

}
