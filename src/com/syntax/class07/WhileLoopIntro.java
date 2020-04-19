package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time=10;
		if (time>12) {
		System.out.println("Good morning");
		}
		//System.out.println("------WHILE LOOP--------");
	//while (time>12) {
	// System.out.println("Good morning");//CODE will execute infinitly
			
		//}
		// in order to stop my infinit loop
		while (time>12) {
			System.out.println("Good morning");
			time++;// this operator is used to stop the loop
		}
		//how to print numbers from 1 to 50
		
		int num=1;
		while(num<=50) {
			System.out.println(num);
			num++;
		}
		//how to print numbers from 20 to 30
		
		int num1=20;
	while(num1<=30) {
			System.out.println(num1);
			num1++;
		}
	
	System.out.println("**********************");
	//how to print numbers from 5 to 15 all in 1 line
	
	int num2=5;
	while(num2<=15) {
		System.out.println(num2+" ");
		num2++;
	}
	
	//how to print values from 10 to 1?
	
	int num3=10;
	while(num3>=1) {
		System.out.println(num3);
		num--;
	}
	}
	

}
