package com.syntax.class14;

public class MethodExamples {

	//want to create a method that will be greeting a person
	
	void greet() {
		System.out.println("Hello Sulaiman");
	}
	void greet1(String name) {
		System.out.println("Hello " + name);
	}
	
	public static void main (String[] args) {
		
		//how do I call method greet? --> first we need to create an object of the class
		//where that method belongs
		//className variableName=new className();
		
		MethodExamples object1=new MethodExamples();
		object1.greet1("Sulaiman");
		object1.greet1("Faisal");
		object1.greet1("john");
		
	}
	
}
