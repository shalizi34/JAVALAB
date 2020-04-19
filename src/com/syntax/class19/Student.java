package com.syntax.class19;

public class Student {

//Write program as a Student class   that has instance variables name and address. 
	//Create a constructor that will initialize those variables.
	// Print name & address of given  student using displayInfo method.
	//TASK 1
	String name;
	String Address;
	Student(String name, String Address){
		this.name=name;
		this.Address=Address;
	}
	void displayinfor() {
		System.out.println("Student name is: "+name);
		System.out.println("Address is: "+Address);
	}
	public static void main(String[] args) {
		Student obj=new Student("Mehar", "15004 Lutz Court Woodbridge VA 22193");
		obj.displayinfor();
	}
}
