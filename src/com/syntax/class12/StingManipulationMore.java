package com.syntax.class12;

public class StingManipulationMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//to get substring from a given String
		//substring =String inside your String
		System.out.println("---------------substring() FUNCTION-------");
		
		String str= "today is a rainy day";
		//is a rainy day
		String partialString=str.substring(6); //start from 6 until the end of String
		System.out.println(partialString);
		
		//rainy day
		partialString=str.substring(11);
		System.out.println(partialString);
		
		//Today
		partialString=str.substring(0, 5);//start from 0 end at index 5
		System.out.println(partialString);
		
		//rainy
		partialString=str.substring(11, 16);
		System.out.println(partialString);
	}

}
