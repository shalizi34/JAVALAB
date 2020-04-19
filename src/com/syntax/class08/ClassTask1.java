package com.syntax.class08;

public class ClassTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//write a program that print numbers from 1 to 100
		// i do not want to print 35-55
		
		for(int a=1; a<=100; a++) {
			if(a>=35 && a<=55) {
				continue;
			}
			System.out.println(a);
		}
	}

}
