package com.oops;

// method return and para 
public class Method4 {
	
	int add(int a,int b){
		
		int z=a;
		int y=b;
		int x=(z+y);
		
		return x;
	}
     String home(String a,String b){
		
		String z=a;
		String y=b;
		String x=(z+ " "+y);
		
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method4 m=new Method4();
		
	 int c=	m.add(34, 52);
		 System.out.println(c);
    
     String z= m.home("raju", "rani"); 
     System.out.println(z+" ");
		 
		 
	}

}
