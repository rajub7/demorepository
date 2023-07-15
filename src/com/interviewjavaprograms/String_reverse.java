package com.interviewjavaprograms;

public class String_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name="tomot";
      int len=name.length();
      String rev = "";
     for (int i =len-1; i >=0; i--){
    	 
     rev=rev+name.charAt(i);
	}
     System.out.println(rev);
     
     if(name.equals(rev)){
    	System.out.println("this is polindram"); 
     }
     else{
    	System.out.println("this is not polindram"); 
     }
     
     
     StringBuffer sb=new StringBuffer(name);
     StringBuffer str= sb.reverse();
     System.out.println(str);
     
   	}

}
