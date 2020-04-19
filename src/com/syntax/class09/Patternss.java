package com.syntax.class09;

public class Patternss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//print patterns using nested Loops
		
		System.out.println("-------Print Paterns using Nested Loops----");
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----Pattern 10X10 ------");
		for(int a=0; a<10; a++) {
			for(int b=0; b<10; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
