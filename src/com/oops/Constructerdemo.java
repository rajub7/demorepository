package com.oops;

public class Constructerdemo {
	int roll;
	int rate;
	
        public Constructerdemo() {
			roll=rate=4;
       // System.out.println("zeropara excute ");
		}
        private Constructerdemo(int x){
        roll=rate=x;
        
        }
        public Constructerdemo(int roll,int rate){
        	this.roll=roll;
        	this.rate=rate;
        }
        void m1(){
        	System.out.println("total:"+ (roll*rate));
        	System.out.println(roll);
        	System.out.println(rate);
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructerdemo cnr2= new Constructerdemo();
		cnr2.m1();
		Constructerdemo cnr= new Constructerdemo(45);
		cnr.m1();
		Constructerdemo cnr1= new Constructerdemo(45,6755);
		cnr1.m1();

	}

}
