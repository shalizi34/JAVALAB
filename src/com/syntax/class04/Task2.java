package com.syntax.class04;

public class Task2 {

	public static void main (String[] args) {
		
		double mortgageRate=3.5;
		int mortgagePrice=180000;
		
		if (mortgageRate>4.5) {
			System.out.println("user will not buy a house");
		}else {
			System.out.println("user will consider buying");
		}
		
		if(mortgagePrice>200000) {
			System.out.println("user will take a loan");
		}else {
			System.out.println("user will pay cash");
		}
	}
}
