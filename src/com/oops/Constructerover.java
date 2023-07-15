package com.oops;

public class Constructerover extends Constructerover2  {
	Constructerover(){
		this("raju",78.0);
		System.out.println("con zero para");
	} 
	Constructerover(int x){
		this();
		System.out.println(" con parameter");
	}
	
	Constructerover(String name,double b){
	    super();
		System.out.println(" con double para");
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Constructerover c=new Constructerover(56);
	}

}
