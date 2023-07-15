package com.oops;

public class Methodoverloading2 {
	public static void main(String[] names,int [] marks) {
		// TODO Auto-generated method stub
		for (int i = 0; i < marks.length; i++) {
			
			System.out.println("marks :"+ marks[i]);
		}
		for (int j= 0; j < names.length; j++) {
	        System.out.println("names:"+names[j]);
		 }
		}
	
	public static void main(int[]rates) {
		// TODO Auto-generated method stub
		for (int j = 0; j < rates.length; j++) {
         System.out.println("rates:"+rates[j]); 
		}
	}
	public static void main(double...per) {
		// TODO Auto-generated method stub
		for (int i = 0; i < per.length; i++) {
			System.out.println("percentage:"+per[i]);
		}
    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < args.length; i++) {
			 System.out.println("names:"+args[i]);
		}
      
	}

}
