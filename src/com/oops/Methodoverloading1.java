package com.oops;

public class Methodoverloading1 {
	static void m1(){
		 int a=34;
		 System.out.println(a); 
    }
    static void m1(int a){
   	System.out.println(a);
   }
    static void m1(int a,String name){
    
   	System.out.println(a);
   	System.out.println(name);
   }
   static void m1(String name,double rate){
   	System.out.println(name);
   	System.out.println(rate);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Methodoverloading1 md=new Methodoverloading1();
		m1();
		m1(45);
		m1(89, "raju");
		m1("raju", 85.56);
	}

}
