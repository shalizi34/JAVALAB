package com.syntax.class05;

public class MoreLogical {
public static void main (String[] args) {
	//we have total 7 days in a week
	//if day is 2,3-->SDLC Class
	//if day 6, 7--> Java Class
	//if day 1, 5--> Off day
	//if day 4--> review class
	
	int day=6;
	if (day==2 && day==3) {
		System.out.println("Today is SDLC Class");
	}else if (day==6 && day==7) {
		System.out.println("Today is Java Class");
	}else if (day==1 && day==5) {
		System.out.println("Today is no class");
	}else if(day==4) {
		System.out.println("Today is a review class");
	}else {
		System.out.println("Invalid day");
	}
	
	//using string
	
	String day1="Saturday";
	if (day1.equals("Tuesday") || day1.contentEquals("Wednesday")) {
		System.out.println("Today is SDLC Class");
	}else if(day1.contentEquals("Saturday") || day1.contentEquals("Sunday")) {
		System.out.println("Today is Java Class");
	}
}
}