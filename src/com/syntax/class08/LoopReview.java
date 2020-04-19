package com.syntax.class08;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ask a user to pay for a candy
		//as long as the entered price is not 2
		// we need keep ask for paying
		//one amount is correct --> "Enjoy your candy"
		
		Scanner scan;
		double price;
		scan=new Scanner(System.in);
		
		do {
		System.out.println("Please pay for a candy");
		price=scan.nextDouble();
	}while(price!=2);
		System.out.println("Enjoy your Candy");

}
}