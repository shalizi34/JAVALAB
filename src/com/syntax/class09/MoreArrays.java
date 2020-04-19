package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//arrays are fixed in size 
		
		String[] students=new String[3];
		students[0]="Hassna";
		students[1]="Faisal";
		students[2]="Kemal";
		students[3]="Aaron";
		
		System.out.println(students[3]);
		
		/////////////////////////////////////////
		
		String[] inClassStudents=new String[5];
		inClassStudents[1]="Hichem";
		inClassStudents[2]="Tetteh";
		
		System.out.println(inClassStudents[0]);// the output is null
	}

}
