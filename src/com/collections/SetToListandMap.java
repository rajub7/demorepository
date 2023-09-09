package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetToListandMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> li=new HashSet<String>();
		li.add("raju");
		li.add("ran");
		li.add("raj");
		li.add("rani");
		
		List<String> st=new ArrayList<String>(li);
		
		for (String string : st) {
		
			System.out.println(string);
		}
		
		
		Map<String,Integer> mp=new HashMap<String, Integer>();
		
		for (int j = 0; j < st.size(); j++) {
			
			mp.put(st.get(j),j);
		}
       System.out.println(mp);
	}

}
