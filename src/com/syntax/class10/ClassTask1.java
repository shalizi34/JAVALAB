package com.syntax.class10;

public class ClassTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array on integers and calculate the sum of all integer elements in an array
		
		int[] integer=new int[5];
		integer[0]=12;
		integer[1]=43;
		integer[2]=60;
		integer[3]=99;
		integer[4]=77;
		
		int average=(integer[0]+integer[1]+integer[2]+integer[3]+integer[4])/5;
				
		System.out.println("The average is "+average);
		
		// other way 
		int[]numbers= {27, 34,56,54,89};
		int sum=0;
		for(int i:numbers) {
			sum+=i;
			
		}
		System.out.println("The sum of the numbers in this array is :"+ sum);
		
		System.out.println(".............other way............");
		
		int sum1=0;
		for(int i=0; i<numbers.length; i++) {
			sum1+=numbers[i];
			System.out.println(sum1);
		}
		
	}

}
