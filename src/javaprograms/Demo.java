package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str[]={"str","fhi","fhg","hgf"};
     StringBuffer sb=new StringBuffer();
     for (int i = 0; i < str.length; i++) {
		sb.append(str[i]);
	}
    String s= sb.toString();
    System.out.println(s);
    
    char ch[]=s.toCharArray();
    Map<Character, Integer> hm=new HashMap<Character, Integer>();
    
    for (char c : ch) {
		if(hm.containsKey(c)){
			
			hm.put(c, hm.get(c)+1);
		}
		else{
			hm.put(c, 1);
		}
	}
    for (Map.Entry<Character, Integer> en : hm.entrySet()) {
    	if(en.getValue()>1){
    		System.out.println(en.getKey()+" "+en.getValue());
    	}
		
	}
	}

}
