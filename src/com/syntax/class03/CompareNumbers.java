package com.syntax.class03;

public class CompareNumbers {

	public static void main (String[] args) {
		
		double numberOne= 10;
		double numberTwo= 10;
		
		if (numberOne>numberTwo) {
			System.out.println("Number one is larger than number 2");
			
		} else if (numberOne<numberTwo){ //else if is used for using multi conditions 
			System.out.println("Number one is smaller than number 2");
		} else {
			System.out.println("Numbers are equal");
		}
		
		//Declare variable for a day and then based on the value we will 
		//output
		
		int day=4;
		if(day==1) {
			System.out.println("It is Monday, no class tdoay");
		
		}else if(day==2) {
			System.out.println("It is Tuesday, we have SDLC Class");
		}else if(day==3) {
		
		System.out.println("It is Wednesday, we have SDDLC Class");
		} else if(day==4) {
			System.out.println("It is Thursday, we have Review Class");
		}else if(day==5) {
			System.out.println("It is Friday, no class");
			
		}else if(day==6) {
			System.out.println("It is Saturday, we have Java Class");
		}else {
			System.out.println("It is Sunday, we have Java Class");
		}
	}
	
}
