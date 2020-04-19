package com.syntax.class04;

public class NestedIfContinues {

	public static void main (String[] args) {
		//check if patient has any allergies
		//if no allergies ..> you are healthy
		//otherwise check if patient has:
		      //orange allergy--> do not eat oranges
		     //apple allergy --> do not eat apples
		    //kiwi allergy--> do not eat kiwis
	
		boolean allergy=true;
		boolean appleAllergy=true;
		boolean orangeAllergy=true;
		boolean kiwiAllergy=false; //we have different variables 
		
		if (allergy) {
			System.out.println("Please answer below");
			if (orangeAllergy) {
				System.out.println("do not eat oranges");
			
				if (appleAllergy) {
					System.out.println("do not eat apple");
				
					if (kiwiAllergy) {
					System.out.println("do not eat kiwis");
				}
				}
			}
		}else {
			System.out.println("you are healthy");
		}
				
	}
	
	
}
