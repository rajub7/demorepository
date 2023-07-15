package com.interviewjavaprograms;

import java.util.Arrays;

public class Arrays_equals_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int arr[]={1,58,58,99,56,54,32};
	    int arr1[]={1,58,58,99,56,54,32};
	  /*  boolean b= Arrays.equals(arr, arr1);
        if(b==true){
        	System.out.println("arrays eqquals");
        }else{
            System.out.println("arrays not equals");
        }
        */
	    boolean flag=true;
        if ((arr.length==arr1.length)) {
        	
        	for (int i = 0; i < arr1.length; i++) {
				if (arr[i]!=arr1[i]) {
					 flag=false;
					 System.out.println("not equal");
				}
			}
			
		} else {
         System.out.println("arrays not equal");
		}
        if(flag==true){
        	System.out.println("arrays equal");
        }
        
        }
	}


