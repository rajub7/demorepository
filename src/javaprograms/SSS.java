package javaprograms;

public class SSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="ttyYYjuf  TTyttegf  ff";
         String s= str.substring(0, 1);
         System.out.println(s);
           System.out.println(s);   
            String s1= s.toUpperCase();
               String s2= str.substring(1);
               String strn=s1+s2;
               System.out.println(strn);
        
        StringBuffer sb=new StringBuffer();
        
       
        for (int i = 0; i < str.length(); i++) {
        	char c=str.charAt(i);
          if(Character.isUpperCase(c)){
			 
           sb.append(Character.toLowerCase(c));
			}
        else{
        	sb.append(Character.toUpperCase(c));
        }
			
		}
      System.out.println(sb);
       }

}

