package com.oops;



public class Car {
	
	void search(Engine e1){
		
		 System.out.println(e1.name);
		 System.out.println(e1.mobilenum);
		 System.out.println(e1.rate);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e1= new Engine();
		Car c=new Car();
		 c.search(e1); 
	}

}
