package com.syntax.class04;

import java.util.Scanner;

public class Task5 {

	public static void main (String[] args) {
		//Create a Java program that will ask if user has a credit card or not. 
		//If you user does not have acredit card then offer them. If they do have one
		//ask what is balance on the card? If balance ofthe card is larger than 1000, tell them to payoff immediately, 
		//otherwise you can tell them that they can spend more.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		boolean card=scan.nextBoolean();
		if (card==true) {
			System.out.println("What is your balance?");
			int bal=scan.nextInt();
			if (bal>=1000) {
				System.out.println("Please pay off your balance.");
			}else {
				System.out.println("You may spend more");
			}
		}else {
			System.out.println("Would you like to sign up?");
		}
	}
}
