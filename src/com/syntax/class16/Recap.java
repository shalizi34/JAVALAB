package com.syntax.class16;

public class Recap {

	
	int sum(int a, int b) {
		return a+b;
		
	}
	
	void sum1(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main (String[] args) {
		
		Recap obj=new Recap();
		int sum=obj.sum(10, 12); //--> 10 and 12 are our arguments 
		//after you add 2 number now divide sum by 10
		
		int result=sum/10;
		obj.sum1(1, 2);
	}
}
