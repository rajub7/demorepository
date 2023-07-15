package com.interviewjavaprograms;

public class Remove_junk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="   atefegfh  13237&^%  %^ASFF   SDFG";
     String s2=str.replaceAll("\\s", "");
     System.out.println(s2);
     String s=str.trim();
     System.out.println(s);
     String s1= str.replaceAll("[^a-z]" ," ").trim();
     System.out.println(s1);
      str.intern();
     
    }

}
