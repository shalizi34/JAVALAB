package com.syntax.class05;

public class LogiclNot {

	public static void main (String[] args) {
		
		//NOT(!) - reverse the condition 
		
		boolean b=!true;
		boolean val=!false;
		
	System.out.println(b);
	System.out.println(val);
	
	boolean isCold=!true;
	if(!isCold) {
		System.out.println("hello");
	}else {
		System.out.println("bye");
	}
	
	String day1="Monday";
	String day2="Friday";
	//if it is not monday or friday --> Find me at Syntax
	//day is not Monday and my day is not Friday
	
	if (!(day1.equals("Monday") && day2.equals("Friday"))) {
		System.out.println("Find me at Syntax");
	}
	}
}
