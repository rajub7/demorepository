package javaprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//rule :1;
     String name="rajur";
     System.out.println(name);
      char arr[]=name.toCharArray();
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
     for (Map.Entry<Character, Integer> en:hm.entrySet()) {
    	 if(en.getValue()>1){
    		 System.out.println(en.getKey()+" ;"+en.getValue());
    	 }
		
	} 
     System.out.println(name);
    // System.out.println(hm);*/
     // rule 2;
     int count=0;
    for(int i=0;i< arr.length;i++){
         count=1;
       for(int j=i+1;j< arr.length;j++){
           // int count=1;
        if(arr[i]==arr[j]&&arr[i]!=' '){
            
           count++;
           arr[j]='0';
        }
        }
        if(count>1&&arr[i]!='0'){
            System.out.println(arr[i]+" :"+count);
           //System.out.println(count);
        }
        
    }
    }
     
     
	}


