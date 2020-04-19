package com.syntax.class03;

public class PrimitiveCasting {

	
	public static void main (String[] args) {
		
		//here we are doing widening, happens implicitly
		double d=10;
		System.out.println(d); //change my int number to decimal
		
		//int i=10.99; --> compile time error saying:
		//type mismatch , cannot convert double to int
		
		//here we are doing explicitly implementing
		int i=(int)10.99; //converting to int type value 
		System.out.println(i);
		
		
	//byte -128 to 127
		
		byte b=(byte)128;
		System.out.println(b);
	}
}
