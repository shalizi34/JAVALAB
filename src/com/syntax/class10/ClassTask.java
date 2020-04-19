package com.syntax.class10;

public class ClassTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array of animals and store 6 elements into it. Using 2 different loops print all elements from the array
		
		String[] animal= {"Camal", "Monkey", "Lion", "Cat", "Tiger", "Elephant"};
		for(String b:animal) {
			System.out.println(b);
		}
		
		
		
		System.out.println("----------------------");
		//other way to print the elements
		
		for(int i=0; i<animal.length; i++) {
			System.out.println(animal[i]+" ");
		}
	}
}




