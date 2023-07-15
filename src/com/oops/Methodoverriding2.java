package com.oops;

public class Methodoverriding2 extends Methodoverriding {
	void m1(){
		System.out.println("m1 override class");
	}
	void m2(){
		System.out.println("m2 override claas");
	}
	void m3(){
		System.out.println("m3 override class");
	}
	void m4(){
		System.out.println("m4 override class");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Methodoverriding2 m= new Methodoverriding2();	
		m.m1();
		m.m1();
		Methodoverriding mr=new Methodoverriding();
		mr.m3();
		mr.m4();
		Methodoverriding md=new Methodoverriding2();
		md.m3();
	}

}
