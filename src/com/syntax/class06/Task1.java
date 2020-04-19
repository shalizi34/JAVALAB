package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ask user to enter their country and capture it. 
		//Once values are captured print which language user speaks. 
	
		Scanner input;
		String country;
		String language;
		
		input=new Scanner(System.in);
		System.out.println("Enter your country");
		country=input.nextLine();
		
		switch(country) {
		
		case "Afghanistan":
			language="Farsi";
			break;
			
		case "America":
			language="English";
			break;
		case "UAE":
			language="Arabic";
			break;
			default:
				
				language="Unknown";	
		}
		System.out.println("You speak "+language);
		
	}
	

}
