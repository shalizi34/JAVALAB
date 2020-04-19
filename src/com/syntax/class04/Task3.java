package com.syntax.class04;

import java.util.Scanner;

public class Task3 {

	public static void main (String[] args) {
		
		//You are a loan specialist and you need to ask user what is the amount of loan is needed.
		// If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("How much loan do you need");
	
		int loan=scan.nextInt();
		System.out.println(loan);
		
		if (loan<=200000) {
			System.out.println("you are approved for loan");
		} else {
			System.out.println("You got rejected");
		}
	}
}
