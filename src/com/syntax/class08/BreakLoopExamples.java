package com.syntax.class08;

public class BreakLoopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int y=1; y<=10; y++) {
			if(y==2) {
				System.out.println("I am skipping iteration");
				continue;
			}
			System.out.println("I am inside the loops");
			System.out.println(y);
		}
		
		//write a program that print numbers from 1 to 20
		// i do not want to print 5,6,7
		
		for(int i=1; i<21; i++) {
			if(i==5 || i==6 || i==7) {
				continue; // this one is used to skips current iteration
				
			}
			System.out.println(i);
		}
	}
	

}
