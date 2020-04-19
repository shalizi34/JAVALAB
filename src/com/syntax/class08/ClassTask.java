package com.syntax.class08;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//write a program to calculate sum of odds and sum of even numbers 
		//1 to 99
		int evenSum=0;
		int oddSum=0;
		for(int i=1; i<99; i++) {
			if(i%2==0) {
				evenSum=evenSum+i;
			}else {
				oddSum=oddSum+i;
			}
		}
		System.out.println("Sum of even =" +evenSum);
		System.out.println("Sum of odd =" + oddSum);
	}
}
