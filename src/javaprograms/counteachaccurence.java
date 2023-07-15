package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class counteachaccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "google";  
		//HashMap char as a key and occurrence as a value  
		HashMap <Character, Integer> charCount = new HashMap<>();  
		 char arr[]=str.toCharArray();
	     Map<Character, Integer> hm=new HashMap<Character, Integer>();
	     
	     for (char c : arr) {
	    	 if(hm.containsKey(c)){
	    		 hm.put(c, hm.get(c)+1);
	    	 }
	    	 else {
				hm.put(c,1);
			}
			
		}
	     System.out.println(hm);
		  
	}


}