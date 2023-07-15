package com.oops;

public class Inheritence2 extends Inheritence{
			 
			 void logintest(){
				System.out.println("login test"); 
				 
			 }
			 void homepagetest(){
				 System.out.println("homepage test");
			 }
			 
			public static void main(String[]args){
				
				Inheritence2 in = new Inheritence2();
				in .claim();
			    in. homepagetest();
			 	in. logintest();
			 	Inheritence irt =new Inheritence();
			 	irt.homepage();
			 	irt.claim();
			 	Inheritence it=  new Inheritence2();
			   it.homepage();
			   
			 	
			}

	}

