package com.syntax.class05;

import java.util.Scanner;

public class Task3 {
	
public static void main (String[] args) {
	//Take age input from  a suer and then based on the age print output
	//if age from 0-3--> you are a baby
	//if age from 4-5--> you are a kid
	//if age from 6-12--> you are a child
	// if age from 13-19--> you are a teenager
	//if age from 20-65-->you are an adult
	//if age is more or equal to 65--> you are a senior
	
	// first - lets declare all variables
	
	int age;
	Scanner scan; //to import we use ctrl+shft+o
	
	//2. capture values
	scan=new Scanner(System.in);
	System.out.println("Please enter you are age");
	age=scan.nextInt();
	
	//3. perform verification
	if (age>0) {
		if (age<3) {
			System.out.println("You are a baby");
		}else if (age>=3 && age<=5) {
			System.out.println("you are a kid");
		}else if (age>=6 && age<=12) {
			System.out.println("You are a child");
		}else if (age>=13 && age<=19) {
			System.out.println("You are a teenager");
		}else if (age>=20 &&  age<65) {
			System.out.println("You are an adult");
		}else {
			System.out.println("You are enjoying your life");
	}
}else {
	System.out.println("Pleae enter valid age");
}
}
}