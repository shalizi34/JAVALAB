package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ask a user where he or she is from
		//based on the country we will define favorite food
		//your favorite food is _____
		
		
		Scanner scan;
		String country;
		String favoriteFood;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
	country=scan.nextLine();
	
	switch(country) {
	case "Moroco":
		favoriteFood="Couscou";
		break; 
	case "Belarus":
		favoriteFood="Potato";
		break;
	case "Tajikistan":
		favoriteFood="Osh";
	case "Turkey":
		favoriteFood="Baklava";
		break;
	case "Afghanistan":
	favoriteFood="Mantu";
	break;
	case "Kazakhistan":
		favoriteFood="Beshparmak";
		break;
		default:
			favoriteFood="Unkown";
	}
	System.out.println("Your favorite food is "+favoriteFood);
	}
	

}
