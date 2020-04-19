package com.syntax.class05;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter in quiz grade");
		int quiz=scan.nextInt();
		System.out.println("Please enter in mid-term grade");
		int mid=scan.nextInt();
		System.out.println("Please enter final scores");
		int finalScore=scan.nextInt();
		int average=(quiz+mid+finalScore)/3;
		if (average>=90) {
			System.out.println("Grade = A");
		}else if (average>=70 && average<90) {
			System.out.println("Grade = B");
		}else if (average>=50 && average<70) {
			System.out.println("Grade = C");
		}else if (average<50) {
			System.out.println("Grade = F");
		}
	}

}
