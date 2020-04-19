package com.syntax.class09;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array of names and store all names of your group. Then print your name from that array.
		// (use 2 different ways of creating an array)
		
		String[] names=new String[5];
		names[0]="Evelyn";
		names[1]="Alex";
		names[2]="Daniel";
		names[3]="Matthew";
		names[4]="Melanie";
		System.out.println(names[0]);
		
		System.out.println("-----------------");//other way to do it 
		String[] name= {"Evelyn", "Alex", "Daniel", "Matthew", "Melanie"};
		System.out.println(name[0]);
	}

}
