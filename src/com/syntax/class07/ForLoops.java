package com.syntax.class07;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Good morning 5 times
		
		for (int c=1; c<6; c++) {
			System.out.println("Good morning");
		}
		
		//print number from 1 to 10
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		//print numbers from 10 to 1
		for(int c=10; c>=1; c--) {
			System.out.println(c);
			
		}
		// what will be the output
		for(int g=0; g<=50; g+=5) {
			System.out.println(g);
		}
		//what is the output
		
		int sum=0;
		for(int b=1; b<5; b++) {
			sum=sum+b;
		}
		System.out.println("value of sum" +sum);
	}

}
