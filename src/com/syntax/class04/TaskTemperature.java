package com.syntax.class04;

import java.util.Scanner;

public class TaskTemperature {

	public static void main (String[] args) {
		
		//Create a Java program that will ask user to input city and temperature. 
		//Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __”
		
		Scanner input=new Scanner(System.in);
		System.out.println("Which city do you live in");
		
	String city=input.nextLine();
	System.out.println("What is the temperature");
		
	float temp=input.nextFloat();
	temp=(temp-32)*5/9;
	System.out.println("the temperature in the city"+city+" is "+temp+" celcius ");	
		
	}
}
