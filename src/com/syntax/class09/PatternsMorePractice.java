package com.syntax.class09;

public class PatternsMorePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int a=1; a<=4; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//printing triangles of numbers 
		for (int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(b+" ");
			}
			System.out.println();
	}

}
}