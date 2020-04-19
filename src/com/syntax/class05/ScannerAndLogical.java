package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {
public static void main (String[] args) {
	
	//you are a salesman
	//ask a user for how much his sales are
	//based on the amount of sales we need to calculate commission 
	//if commission is between 1 - 100 --> your commission should be 10%
	//if sales is between 100 and 200 --> commission should be 20%
	//is sales between 200 and 500 --> commission should be 30%
	//if sales more than 500 --> commission should be 50%
	
	//1. declare the variables that i will need
	
	Scanner scan;
	double sales;
	double commission;
	
	scan=new Scanner(System.in);
	System.out.println("please enter your sales amount");
	sales=scan.nextDouble();
	if (sales>=1 && sales<=100) {
		//give user 10% commission
		commission=sales*0.10;
		
	}else if(sales>100 && sales<=200) {
		//give user 20% commission 
		commission=sales*0.20;
		
	}else if (sales>200 && sales<=500) {
		//give user 30% commission
		commission=sales*0.3;
	}else {
		commission=sales*0.5;
	}
	System.out.println("Based on your sales your commision is ="+commission);
}
}
