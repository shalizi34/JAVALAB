package com.syntax.class04;

public class MoreNestedIf {

	public static void main (String[] args) {
		
		//declare date and a day
		//if day is Friday -->if date is 13 --> watch a scary movie
		//if day is friday --> if date is not 13 --> watch a comedy
		
		boolean isFriday=false;
		int date=13;
		
		if(isFriday) {
			System.out.println("Today is friday, I am going to a movie");
			if(date==13) {
				System.out.println("I will watch scary movie");
			}else {
				System.out.println("I will watch a comedy");
			}
		}else {
			System.out.println("today is not friday, I am staying home");
		}
	}
		
}
