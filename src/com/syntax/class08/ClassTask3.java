package com.syntax.class08;

import java.util.Scanner;

public class ClassTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a program that will be asking user to apply for a credit card 10 times.
		// As soon you get an �yes� from a user program should stop asking.
		
    Scanner scan = new Scanner(System.in);
    for (int i = 1; i <= 10; i++) {
        System.out.println("Please apply credit card");
       
        String creditCard = scan.nextLine();
        if (creditCard.equals("Yes")) {
            System.out.println("Congrat! you apply credit card");
            break;
        }
    }
	}
}



