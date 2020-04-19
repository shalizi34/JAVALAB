package com.syntax.class12;

public class Tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create a String and print it in reverse order (Sunday -> yadnuS)
		
		
		String str="Sunday";
		char reverse;
		for (int i=str.length()-1;i>-1;i--) {
			reverse=str.charAt(i);
			System.out.print(reverse);
		}
		System.out.println();
		
//Create a String and if the String is not empty perform the following:
// If the String has an odd number of characters and has 3 or more characters,
//print the character in the middle of the String
		
		
String str1= "Sundays";

char days=str1.charAt(3);
System.out.println(days);
		}
	}

