package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//we want to ask user's name 5 times and print Good Afternoon _____;
		
		Scanner input;
		String name;
  		int num=1;
		
		
		input=new Scanner(System.in);
		while(num<=5) {
			System.out.println("what is your name");
		}
		name=input.nextLine();
		
		System.out.println("Good Afternoon " + name);
		num++;
	}

}
