package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str=new ArrayList<String>();
	       str.add("raju");
	       str.add("charan");
	       str.add("ambika");
	       str.add("trinayana");
	       
<<<<<<< HEAD
	     Object[] arr=str.toArray();
	     
	     for (Object string : arr) {
			System.out.print(string);
		
=======
	       Object[]  obj=str.toArray();
	       
	       for (Object ob : obj) {
			System.out.print(ob+" ,");
			
>>>>>>> eddbbc1597dee335b2e6041bff9eb4892268c43f
		}
	       
	    	
	     Set<String> str1=new HashSet<String>();
	       str1.add("raju");
	       str1.add("rani");
	       str1.add("priya");
	       str1.add("tony");
	       
<<<<<<< HEAD
	     Object[] arr1=str1.toArray();
	     for (Object stn : arr1) {
				System.out.println(stn);
				
			}
	     
	     Map<Integer,String> mp=new HashMap<Integer,String>();
	     
         mp.put(1,"raju");
     mp.put(2,"charan");
    mp.put(3,"ambika");
     mp.put(4,"trinayana");
     Object[] ar=mp.values().toArray();
           for(Object s:ar){
       System.out.println(s);
=======
	       Object[]  object=str1.toArray();
	       System.out.println(" ");
	       for (Object ob : object) {
	    	  
			System.out.print(ob+" ,");
		}
	       
	  
	     Map<Integer,String> mp=new HashMap<Integer,String>();
	     
         mp.put(1,"raju");
         mp.put(2,"charan");
         mp.put(3,"ambika");
        mp.put(4,"trinayana");
        System.out.println(" ");
     Object[] ar=mp.values().toArray();
           for(Object s:ar){
        	   
       System.out.print(s+" ,");
>>>>>>> eddbbc1597dee335b2e6041bff9eb4892268c43f
      }
	       
	}

}
