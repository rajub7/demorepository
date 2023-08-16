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
	       
	     String[] arr=str.toArray(new String[str.size()]);
	     
	     for (String string : arr) {
			System.out.println(string);
			System.out.println(".............");
		}
	    	
	     Set<String> str1=new HashSet<String>();
	       str1.add("raju");
	       str1.add("rani");
	       str1.add("priya");
	       str1.add("tony");
	       
	     String[] arr1=str1.toArray(new String[str1.size()]);
	     for (String stn : arr1) {
				System.out.println(stn);
				System.out.println("............");
			}
	     
	     Map<Integer,String> mp=new HashMap<Integer,String>();
	     
         mp.put(1,"raju");
     mp.put(2,"charan");
    mp.put(3,"ambika");
     mp.put(4,"trinayana");
     String[] ar=mp.values().toArray(new String[mp.size()]);
           for(String s:ar){
       System.out.println(s);
      }
	       
	}

}
