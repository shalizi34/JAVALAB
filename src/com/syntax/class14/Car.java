package com.syntax.class14;

public class Car {

	//define feature of the car

	String make;
	String model;
	 int year;
	String color; 
	int speed;
	
	//define behavior
	
	void drive() {
		System.out.println(make+" Car can drive");
	}
	void accelerate() {
		System.out.println(make+" Car can accelerate");
	}
	void makeNoise() {
		System.out.println(make+" Car make noise");
	}
	void stop() {
		System.out.println(make+" Car stops when you press break ");
		System.out.println("Car stops");
	}
	}

