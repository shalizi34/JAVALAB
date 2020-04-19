package com.syntax.class11;

public class ClassTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create an array of countries; north american countries,
		//south america, europe, asian, african.
		//Then print all values from that array using 2 different loops
		//and calculate how many total countries are being stored
		
		String[][] countries = { { "Canada", "USA" },
				{ "Mexico", "Brasil", "Uruguay", "Argentina" },
				{ "England", "Poland", "Italy", "France" },
				{ "China", "India", "Pakistan" },
				{ "Zaire", "South Africa", "Ghana", " Nigeria" } };
		int sum = 0;
		for (int i = 0; i < countries.length; i++) {
			for (int j = 0; j < countries[i].length; j++) {
				System.out.print(countries[i][j] + " ");
				sum++;
			}
			System.out.println();
		}
		System.out.println("total "+sum);

		
	}
}
