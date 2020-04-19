package com.syntax.class05;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		
		//Write a program to find largest of three double values using if-else..
		//if and logical operators provided by a user (numbers must be distinct)

		Scanner scan;
		double num1;
		double num2;
		double num3;
		double largest=0.0;
		scan=new Scanner(System.in);
		System.out.println("Please enter three decimal numbers");
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		num3=scan.nextDouble();
		if (num1>num2 && num1>num3) {
			largest=num1;
		}else if (num2>num1 && num2>num3) {
			largest=num2;
		}else if (num3>num1 && num3>num2) {
			largest=num3;
		}
		System.out.println("Largest number is" +largest);
	}

}
