package com.syntax.class15;

public class Task {

	//Create a method that will take 2 parameters as a number and print which number is larger

		void largest(int a, int b) {
			if(a>b) {
				System.out.println(a+" is the largest number");
			}else {
				System.out.println(b+" is the largest number");
			}
		}
		
		public static void main(String[] args) {
			
			Task num=new Task();
			num.largest(12, 9);
		}
		}

