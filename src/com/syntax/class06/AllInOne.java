package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//write a program to ask user if there is sale
		//if there is no sale -->not going shopping
		//if sale we will ask the price of the item
		// based on the price we will apply discount and calculate final price
		//if price less than 20-->10% discount
		//if price between 20 and 100--> apply 20%
		//if price between 100 and 500 --> 30% 
		//if price more than 500--> apply 50% discount 
		// after discount ----- the price of the item reduced from___to____
		
		Scanner scan;
		String sale;
		double price=0;
		double discount=0; 
		double finalPrice=0;
		
		scan=new Scanner(System.in);
		System.out.println("Ask user if there is a sale?");
		sale=scan.nextLine();
		
		if (sale.equalsIgnoreCase("yes")) {//equalsIgnoreCase ignores upper or lower case of a letter
			System.out.println("What is the price?");
			price=scan.nextDouble();
			
				if (price<20) {
				discount=price*0.1;
				
				
				}else if (price>=20 && price<=100) {
					discount=price*0.2;
					
				}else if (price>=100 && price<=500) {
					discount=price*0.3;
					
				}else if (price>500) {
					discount=price*0.5;
				
			}else {
				System.out.println("We will not go shopping");
			}
			
			finalPrice=price-discount;
			
			System.out.println("After discount "+discount+"the price of thh item reduced from  "+price+" to "+finalPrice);
		}
		
	}

}
