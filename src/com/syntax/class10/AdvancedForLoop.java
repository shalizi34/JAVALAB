package com.syntax.class10;

public class AdvancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] fruit= {"Bananan", "Kiwi", "Apple", "Mango"};
		//if fruit is apple --> that is your favorite fruit 
		//advanced for loop or enhanced for loop or for each loop
		for(String y:fruit) {
			if(y.equals("Apple")) {
			System.out.println(y + " is your favorite fruit");
		}else {
			System.out.println(y);
		}
		
	}

	}
}
