package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class List_To_SetAndMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>li=new ArrayList<String>();
		li.add("raju");
		li.add("rani");
		li.add("raj");
		li.add("rani");
		
		Set<String> st=new HashSet<String>(li);
		
		for (String string : st) {
			System.out.println(string);
		} 
		System.out.println(st);
		
   Map<Integer, String> mp= IntStream.range(0, li.size()).boxed().collect(Collectors.toMap(i->i, li::get));
     System.out.println(mp);   
   
   
   Map<Integer, String> map=new HashMap<Integer, String>();
    for (int i = 0; i < li.size(); i++) {
		map.put(i,li.get(i));
	}
    
    System.out.println(mp); 
   
	}

}
