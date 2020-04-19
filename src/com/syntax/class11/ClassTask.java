package com.syntax.class11;

public class ClassTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an array of cars :american, german, korean, italian
		//Then retrieve all values from that array using 2 different loops
		
		String[][] cars= {
                {"Ford", "Lincoln", "GMC", "Cheverolet"},
                {"BMW", "Benz", "Audi"},
                {"Hyundai", "Kia"},
                {"Alfa", "Fiat"}
        };
		
		 for(String[] make :cars) {
	            for(String model:make) {
	                System.out.print(model+" ");
	            }
	            System.out.println();
	}
//other way to do it
		 System.out.println("------------Other Way''''''''''''''");
		 
		 String [][] motors= {
					{"Ford", "Chevy", "Buick", "GMC"},
					{"BMW", "Mercedes", "Volkswagen"},
					{"Kia", "Hyundai"},
					{"Fiat", "Ferrari", "Lamborghini"},
			};
			for (int r=0; r<motors.length; r++) {
				for (int c=0; c<motors[r].length; c++) {
					System.out.print(motors[r][c] + " ");
				}
				System.out.println();
			}
			for (String [] array:motors) {
				for (String model:array) {
					System.out.print(model+ " ");
				}
				System.out.println();
			}
}
}
