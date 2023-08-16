package com.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

   public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   String ar[]={"rah","af","at","th"};
	   List<String> lt= new ArrayList<String>(Arrays.asList(ar));
	   System.out.println(lt);
	  
	   Integer[] arr={17,9,65,0,9};
       List <Integer> al=  new ArrayList<Integer>(Arrays.asList(arr));
	   System.out.println(al);
	   
	   int[] arr2={1,3,4,69,8,7};
	   List<Integer> list=Arrays.stream(arr2).boxed().collect(Collectors.toList());
	   System.out.println(list);
	   System.out.println(".............");
	    
       ArrayList<String> str=new ArrayList<String>();
       str.add("raju");
       str.add("charan");
       str.add("ambika");
       str.add("trinayana");
       System.out.println(str);
       
       
       boolean b= str.retainAll(str);
    	System.out.println(b);	 
      
       Object str1=  str.clone();
       System.out.println(str1);
       
       boolean b1= str.contains("raju");
       System.out.println(b1);
      
      
       Object[] arr1=  str.toArray();
       for (Object obj : arr1) {
		System.out.print(obj+",");
	  }
       str.clear();
	}

}
