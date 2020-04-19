package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Allow user to enter grade and then provide explanation: 
//A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
//At the end your program should print which grade was entered by a user with explanation.
		
		Scanner scan;
		char grade;
		String explaination;
		
		scan=new Scanner(System.in);
		System.out.println("Enter your grade and explaination");
		grade=scan.next().charAt(0);
		
		switch(grade) {
			case 'A':
				explaination="Excellent";
				break;
			case 'B':
				explaination="Good";
				break;
			case 'C':
				explaination="Average";
				break;
			case 'D':
				explaination="Bad";
				break;
				default:
					explaination="Not Acceptable";
				
	}
System.out.println("Your grade is "+ grade+ " "+explaination);


	}
}
