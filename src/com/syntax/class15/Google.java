package com.syntax.class15;

public class Google {

	//define features such as employee id, name, last name, salary
	//define a behavior 
	
	int empId;// these are the features
	double salary;
	
	String name, lastName, title;
	
	void working() //method header 
	{ //method body
		System.out.println(title +" is working");
	}
	void getPaid() {
		System.out.println(name +" is getting paid "+salary);
	}
	void attendMeetings() {
		System.out.println(name+" is attending meetings");
	}
	
	public static void main (String[] args) {//these are the objects
		
		//creating the first object
		 Google emp1=new Google();
		 emp1.empId=123;
		 emp1.name="John";
		 emp1.lastName="Smith";
		 emp1.title="CEO";
		 emp1.salary=20000;
		 emp1.working();
		 emp1.getPaid();
		 emp1.attendMeetings();
		 
		 //Creating the second object 
		 Google emp2=new Google();
		 emp2.empId=124;
		 emp2.name="Seyma";
		 emp2.lastName="Atasoy";
		 emp2.title="Engineer";
		 emp2.salary=10000;
		 emp2.working();
		 emp2.getPaid();
		 emp2.attendMeetings();
		 
		 
		 }
}
