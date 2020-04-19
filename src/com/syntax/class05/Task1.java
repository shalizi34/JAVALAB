package com.syntax.class05;

import java.util.Scanner;

public class Task1 {
public static void main (String[] arg) {
	//prompt the user to enter person heights in inches.
	//person should be classified as one of the following:
	//-short(under 60 inch)
	//-medium (between 60-72)
	//-tall(over 72 inch)
	
	int height;
	
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your heights in inches");
	height=input.nextInt();
	
	if (height>=0 && height<= 60) {
		System.out.println("The person is short");
	}else if (height>=60 && height<=72) {
		System.out.println("The person is medium");
	}else if (height > 72) {
		System.out.println("You are tall");
	}else {
		System.out.println("The preson is tall");
	}
}
}
