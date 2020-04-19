package com.syntax.class07;

import java.util.Scanner;

public class HW1 {

	
	public static void main (String[] args) {
		
		Scanner scan;
		int num1;
		int num2;
		char operator;
		int result=0;
		scan=new Scanner(System.in);
		System.out.println("Please enter two numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println("Please enter one operator (ex. +, -, /, *)");
		operator=scan.next().charAt(0);
		switch (operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		default:
			System.out.println("You have entered wrong operator");
		}
		
		if (result != 0.0) {
			System.out.println("your calculation is " + result);
	
	}
}
}
