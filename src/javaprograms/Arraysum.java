package javaprograms;

import java.util.Arrays;

public class Arraysum {
	int[] add(int[]even ,int[]add){
		 int length=even.length;
		 length=add.length;
		
		int[] res= new int[length];
		for (int i = 0; i < res.length; i++) {
			 res[i]=even[i]*add[i];
		}
		
		
		return res;	
	}
    
   public static void main(String[] args) {
	int[] fis={1,4,3,5,7,9};
	int[] sec={4,6,89,2,5};
	Arraysum sum=new Arraysum();
	  int [] resulst=sum.add(fis, sec);
	
	System.out.println(Arrays.toString(resulst));
  }
}
 