package com.syntax.class10;

public class RetrieveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] grades= {'A', 'B', 'C','D', 'E','F'};
		//getting all elements
		
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]+" ");
		}
		
		//another way to retrieve the elements
		System.out.println("---------printing using advanced for loop----");
		
		for(char grade:grades) {
			System.out.println(grade);
	}

	// create an array of fruit and retrieve all elements 
		
		String[] fruit= {"Bananan", "Kiwi", "Apple", "Mango"};
		//if fruit is apple --> that is your favorite fruit 
		//advanced for loop or enhanced for loop or for each loop
		for(String y:fruit) {
			if(y.equals("Apple")) {
			System.out.println(y + " is your favorite fruit");
		}else {
			System.out.println(y);
		}
		
		System.out.println("..................");
		//by doing through regular for loop 
		for(int i=0; i<fruit.length; i++) {
			System.out.println(fruit[i]);
		}
}
}
}