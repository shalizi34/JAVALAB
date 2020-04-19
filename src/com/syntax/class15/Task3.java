package com.syntax.class15;

public class Task3 {

	
	//Create a method that will say Hello in different language based on the country that will pass when 
	//method is executed
	
	 void lang(String word) {
	        switch(word) {
	        case "Russia":
	            System.out.println("Privet");
	            break;
	        case "Tajikistan":
	            System.out.println("Salom");
	            break;
	        case "Mexico":
	            System.out.println("hola");
	            break;
	            default:
	                System.out.println("wrong language");
	        
	        }
	    }
	    
	    public static void main (String [] args) {
	        
	        Task3 obj = new Task3();
	        
	        obj.lang("Russia");
	        
	    }

}