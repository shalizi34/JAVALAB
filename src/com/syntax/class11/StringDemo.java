package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String school=" Syntax ";
	        String str=new String("HELLO");
	        String str1="This a String 7676,&^&^";
	        
	        //how many characters String has
	        System.out.println("----- LENGTH() FUNCTION -----");
	        System.out.println(school.length());
	        
	        int size=str.length();
	        System.out.println("String length is "+size);
	        
	        //convert String to lowercase or uppercase
	        System.out.println("----- TOUPPERCASE/TOLOWERCASE FUNCTION -----");
	        System.out.println(school.toUpperCase());
	        System.out.println(str.toLowerCase());
	        str=str.toLowerCase();
	        System.out.println(str);
	        
	        //concatinate 2 String
	        System.out.println("----- CONCAT FUNCTION -----");
	        String newString=str+school;
	        System.out.println(newString);
	        
	        String day="Saturday";
	        String date="14";
	        
	        String newDate=day.concat(date);
	        System.out.println(newDate);
	        
	        char grade='A';
	        String str2="Student";
	        // below code will give CE, 
	        //since concat() method is used to attach 1 String to another String
	        //str2.concat(grade);
	        
	        String str3="";
	        boolean empty=str3.isEmpty();
	        System.out.println(empty);
	        
	        System.out.println("----- trim() FUNCTION -----");
	        //removes empty/white space at the begiining and end of the String
	        String str4="   Welcome to Syntax!   ";
	        
	        str4=str4.trim();
	        System.out.println("String with no leading or trailing spaces:"+str4);
	    }
}
