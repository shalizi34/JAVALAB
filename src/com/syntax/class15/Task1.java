package com.syntax.class15;

public class Task1 {

	
	//Create a method that will take a number and print whether the number is even or odd
	
    void number(int a) {
        if (a%2==0) {
            System.out.println(a+" is even");
        }else {
            System.out.println(a+" is odd");
        }
    }
    
    public static void main(String[] args) {
        Task1 result=new Task1();
        
        result.number(11);
    }
}

