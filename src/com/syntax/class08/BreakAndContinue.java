package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//to stop the execution of our loop we use Break
		
		//once i=4 --> we want to stop the loop
		
		for(int i=1; i<=10; i++) {
			if(i==4) {
				System.out.println("I am stopping loop");
				break;
			}
			System.out.println(i);
		}
		System.out.println("I am outside of the loop ");
	}

}
