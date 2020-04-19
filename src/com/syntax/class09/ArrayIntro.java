package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10;
		
		int num1;
		num1=10;
		
		//declare an array and initialize it
		
		int[] array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		//in programming indexes always starts with 0...
		
		//access elements from an array 
		System.out.println(array[1]);
		System.out.println(array[3]);
		
		//second way 
		String[] carArray; // this way is more preferable 
		String carArray1[]; //This way is also possible to declare 
		
		carArray=new String[3];
		carArray[0]="BMW";
		carArray[1]="Honda";
		carArray[2]="Toyota";
		System.out.println("I am driving"+ " "+carArray[2]);
		///////////////////////////////////////////////////////////////////
		
		int[] numbers=new int[3];
		numbers[0]=100;
		numbers[1]=200;
		numbers[2]=300;
		
		//I would like to change the value of number[1]
		numbers[1]=2000;
		
		System.out.println(numbers[1]+numbers[0]);
		
		
	}

}
