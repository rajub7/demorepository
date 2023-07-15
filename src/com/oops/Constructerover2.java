package com.oops;

public class Constructerover2 {
   Constructerover2(){
		this(7);
		System.out.println("con parent zero para");
	} 
	Constructerover2(int x){
		this("raju",78.90);
		System.out.println(" con parent parameter");
	}
	
	Constructerover2(String name,double b){
	   
		System.out.println(" con parent double para");
	}
 

}
