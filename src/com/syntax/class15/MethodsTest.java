package com.syntax.class15;

public class MethodsTest {

	public static void main (String[] args) {
		
		Methods obj=new Methods();
		obj.sayWelcome();
		obj.sayAnything("Hello", 2);
		obj.sayAnything("Salam", 5);
		obj.sayAnything("Love", 8);
		
		obj.isItRaining(true);
		obj.isItRaining(false);
		
	}
}
