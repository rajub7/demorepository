package com.interviewjavaprograms;

class Count_accurence_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="sr adf ggfs fn ggfjh";
    String s=str.trim();
    System.out.println(s);
    String arr[]=str.split(" ");
    for (String string : arr) {
		System.out.println(string);
	}
    int count=str.length();
    int count1=str.replace(" ","").length();
    int res=count-count1;
    System.out.println(res);
    /*char[] arr=str.toCharArray();
    for (int i = 0; i < arr.length; i++) {
		System.out.println(i);
	}
	*/}

}
