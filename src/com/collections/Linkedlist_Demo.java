package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist_Demo {
	

	public static void main(String[] args) {
		String[] ar={"rah","af","at","th"};
		List<String> lt= new LinkedList<String>(Arrays.asList(ar));
		System.out.println(lt);
		// TODO Auto-generated method stub
        LinkedList<String> li=new LinkedList<String>();
        li.push(" tonu ");
        li.push("java");
        li.push("python");
        li.push("java");
        li.push("selenium");
        li.push(".net");
        li.push("cucumber");
        li.push("none");
        System.out.println(li);
        System.out.println(li.peek());
        System.out.println(li.poll());
        
       HashSet<String>hs=new HashSet<String>(li);
       
       for(String str:hs) {
    	   System.out.println(str);
       }
    /*    Iterator<String> it=li.iterator();
        boolean b= it.hasNext();
        while (it.hasNext()) {
		String str= (it.next());
		System.out.println(str);
    	}
        li.clone();
    //  System.out.println(li);
    //  li.clear();
        System.out.println(li);
        Object[] arr= li.toArray();
        for (Object obj : arr) {
			System.out.println(obj);
		}*/
      }
    }