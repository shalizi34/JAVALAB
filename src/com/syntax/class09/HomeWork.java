package com.syntax.class09;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array)
		
		char[] ch=new char[6];
		ch[0]='A';
		ch[1]='B';
		ch[2]='C';
		ch[3]='D';
		ch[4]='E';
		ch[5]='F';
		System.out.println(ch[1]);
		
		System.out.println("----------------------");//other way to do it 
		char[] grade= {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(grade[1]);
	}

}
