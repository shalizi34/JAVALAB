package com.syntax.class10;

public class RetrievingValuesFrom2Darry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][]month= {
				{"January", "February", "December", "Hi", "Hello"},
				{"March", "April", "Mary"},
				{"June", "July", "August"},
				{"September", "October", "November"}
	};
	int rows=month.length;
	int firstArray=month[0].length;
	System.out.println(firstArray);
		
	for(int i=0; i<month.length; i++) {
		for(int j=0; j<month[i].length; j++) {
			System.out.println(month[i][j]);
		}
	}
	
		
	}

}
