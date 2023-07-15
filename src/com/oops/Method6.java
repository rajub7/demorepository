package com.oops;

import java.util.Arrays;
 // method with return array
   public class Method6 {
   String[] add(String[]arr,String[]arr1){
	   int str = arr.length ;
	    str=arr1.length;
	   String[]res=new String[str];
	   for (int i = 0; i <arr.length; i++) {
		
			 res[i]=arr[i]+arr1[i];
			 
		}
		return res;  
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String[] nat={"raj","rani","shoba","sita"};
      String[] exm={"taj","naveen","show","roopa"};
      
      Method6 m= new Method6();
      String[] mtr= m.add(exm, nat);
      System.out.println(Arrays.toString(mtr));
      
	}

}
