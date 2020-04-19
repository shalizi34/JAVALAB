package com.syntax.class10;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] numbers=new int[3][4];
		//1 row
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		
		//2 rows
		numbers [1][0]=5;
		numbers[1][1]=10;
		numbers[1][2]=15;
		numbers[1][3]=20;
		
		//3 rows
		numbers [2][0]=1;
		numbers[2][1]=2;
		numbers[2][2]=3;
		numbers[2][3]=4;
		
		//print value of 15
		
		System.out.println(numbers[1][2]);
		
		//other way to do it
		System.out.println("...........other way...........");
		
		int[][]nums= {//array of 3 single dimensional arrays
				         {10, 20,30,40}, 
				         {5, 10, 15, 20}, 
				         {1, 2, 3, 4}
				     };
		System.out.println(nums[2][3]);//here we are retrieving 4
		System.out.println(nums[0][2]);//here 30
		
		//other example
		System.out.println("............other Example.........");
		
		String[][]month= {
				{"January", "February", "December"},
				{"March", "April", "Mary"},
				{"June", "July", "August"},
				{"September", "October", "November"}
		};
		System.out.println(month[0][0]);
		System.out.println(month[1][0]);
		System.out.println(month[2][2]);
		System.out.println(month[3][1]);

		}
	}

