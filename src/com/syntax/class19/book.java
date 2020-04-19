package com.syntax.class19;

public class book {

	
	//Write program as a Book class   that will have 2 Constructors. While creating an object make sure:
	//Instance variables are being initialized
	//Both Constructors are being executed
//TASK2
	String book1;
    String book2;
    book(String a , String b){
        this();
        book1=a;
        book2=b;
        System.out.println(a+b);
}
    book() {
        
        System.out.println("i like this book");
    }
    
    public static void main(String[] args) {
        
        
        book obj = new book("Lie","Life");
    }
}
