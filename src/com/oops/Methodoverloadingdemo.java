package com.oops;

public class Methodoverloadingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading2 md=new Methodoverloading2();
       String[] arr={"raju","rani","subhangi","siva"};
       int[] arr1={1,34,67,89,54,34};
       md.main(arr, arr1);
       int[] rs={866,345,675,895,554,384};
       md.main(rs);
       md.main(new double[]{85.63,45.23,56.85,89.65});
       String[] name={"raju","rani","subhangi","siva"};
        md.main(name);
       }
}
