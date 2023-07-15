
package com.oops;
   //  method with para array

    public class Method5 {
  
    	void m1( int[] arr,int a){		
    	for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);	
		}
    	System.out.println(a);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method5 m= new Method5();
        int[] b={1,9,8,67,5,56};
        int c=67;
        m.m1(b,c);      
	}
}
