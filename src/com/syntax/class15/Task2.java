package com.syntax.class15;

public class Task2 {

	
	
	//Create a method that will print whether given String is palindrome or not
	
	void isPalindrome(String word) {
	    char [] array = word.toCharArray();
	    String reverse="";
	    for (int i=array.length-1; i>=0; i--) {
	        reverse+=array[i];
	    }
	    if (reverse.equalsIgnoreCase(word)) {
	        System.out.println("Word is palindrome");
	    }else {
	        System.out.println("Word is not palindrome");
	    }
	}

	
	public static void main (String[] args) {
		
		Task2 obj=new Task2();
		obj.isPalindrome("Madam");
	}
}

