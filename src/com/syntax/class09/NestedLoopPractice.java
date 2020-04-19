package com.syntax.class09;

public class NestedLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//using nested loops to print 
		for(int a=0; a<10; a++) {
			for(int b=0; b<10; b++) {
				for(int m=0; m<10; m++) {
					for(int y=0; y<10; y++) {
						System.out.println(a+" "+b+" "+m+" "+y);
					}
				}
			}
		}
	}

} 
// or you can also do it through

//for(int a=0; a<=9999; a++) {
// System.println(a);