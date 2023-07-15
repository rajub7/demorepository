package javaprograms;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int n=3;
	      int m=4;
	        int[][] arr
	            = { { 3, 2, 7,6}, { 2, 6, 8 ,5}, { 5, 1, 9,6 } };
	 
	        // Iterating over all 1-D arrays in 2-D array
	        for (int i = 0; i < n; i++) {
	            // Printing all elements of ith row
	            for (int j = 0; j <m; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	    
	
    int al=64;
    for(int i=1; i<=5;i++){
    	
        for(int j=1;j<=i; j++){
       
      System.out.print((char)(al+j)+" ");
  
        }
    System.out.println(" ");

   }


}
}