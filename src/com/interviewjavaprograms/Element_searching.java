package com.interviewjavaprograms;

public class Element_searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]={2,5,4,6,9};
   int elmt=9;
   boolean flag=false;
   for (int i = 0; i < arr.length; i++) {
	 if(elmt==arr[i]){
		 System.out.println("position"+i);
		 flag=true;
		 break;
		 
	 }
     }
   if(flag==true){
	  System.out.println("found"); 
   }else{
	 System.out.println("not found");  
   }
	}

}
