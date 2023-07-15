package javaprograms;

import java.util.Arrays;

public class Find_min_2arrays {
	
	int min(int[]a,int[]b){
		int min=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]<min){
				min=a[i];
			}
		}
			for (int i = 0; i < b.length; i++) {
				if(b[i]<min){
					min=b[i];
				}	
		}
			return min;
	
		}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find_min_2arrays c=new Find_min_2arrays();
      int arr[]={14,6,78,9,4};
      int arr1[]={2,5,7,8,9};
     int z=   c.min(arr, arr1);
     System.out.println(z);
	}

}
