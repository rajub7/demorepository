package com.interviewjavaprograms;
import java.util.Arrays;

public class Binary_search_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]={1,2,4,7,9,76,98,4,6};
       // System.out.println(Arrays.toString(arr));
     Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
      
      
      int l=0;
      int h=arr.length-1;
      int key=7;
      
      boolean flag=false;
      while(l<=h){
      int mid=(l+h)/2;
    	  
      if(arr[mid]==key){
    	  System.out.println("found");
    	  flag=true;
    	  break;
      }
      if(arr[mid]<key){
    	  l=mid+1;
      }
      if(arr[mid]>key){
    	  h=mid-1;
      }
	}
    if(flag==false){
    System.out.println("not found");
    }
  }
}
