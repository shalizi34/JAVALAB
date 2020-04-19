package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	//Create an arraylist of cars and retrieve all the values using 3 different ways.
	
	public static void main (String[] args) {
	
		ArrayList<String> cars=new ArrayList<>();
		cars.add("Mercedez");
		cars.add("Toyota");
		cars.add("Suzuki");
		
		//1. retrive all elements using enhanced loop
		for(Object car:cars) {
			System.out.println(car);
		}
		//2. retrive all elements using for loop
		for(int i=0; i<cars.size(); i++) {
			String d=cars.get(i);
			System.out.println(d);
		}
		//3. printing all elements using iterator
		Iterator<String> iterator=cars.iterator();
		while(iterator.hasNext()) {
		String d=iterator.next();
		System.out.println(d);
}
	}
}
