package com.syntax.class07;

public class WhilevsDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//hello 5 times
		
		int num=1;
		while(num<=5) {
			System.out.println("Hello");
			num++;
		}
		System.out.println("---------USING DO WHILE LOOP-------");
		
		//hello 5 times
		
		int num1=1;
		do {
			System.out.println("Hello");// while never executes if the condition is false but do while executes even if the condition is false
			num1++;
			}while(num1<=5);
		}

}
