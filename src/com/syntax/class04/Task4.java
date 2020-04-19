package com.syntax.class04;

import java.util.Scanner;

public class Task4 {

	public static void main (String[] args) {
		
		//You are DMV representative and you need toask customer their age. 
		//If they are 18 and older you will issue a driver licence to them,
		//otherwise you will offer them to get a learners permit.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How old are you");
		
		int age=scan.nextInt();
		
		if(age>=18) {
			System.out.println(" you will get a driving licence");
			
		}else {
			System.out.println(" you will get learners' permit");
		}
	}
}
