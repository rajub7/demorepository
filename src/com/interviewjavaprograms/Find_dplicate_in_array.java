package com.interviewjavaprograms;

public class Find_dplicate_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]={12,34,5,997,87,98};
     boolean flag=false;
      for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==arr[j]){
				System.out.println(arr[j]);
				flag=true;
			}
			}
	}
      if(flag==true){
    	  System.out.println("duplicate");
      }else{
    	 System.out.println("no duplicates"); 
      }
     
	}

}
