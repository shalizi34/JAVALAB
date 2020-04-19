package com.syntax.class04;

public class Task1 {

	public static void main (String[] args) {
		
		boolean diploma=true;
		double gpa=3.5;
		
		if (diploma) {
			System.out.println("Congratulation");
			
			if(gpa>=3.5) {
				System.out.println("you are eligible for scholarship");
			}else {
				System.out.println("you should have studied harder");
			}
		}else {
			System.out.println("Get a degree");
		}
	}
}
