package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] grades=new int[4];
		grades[0]=90;
		grades[1]=67;
		grades[2]=89;
		grades[3]=78;
		
		//what is average
		
		int average=(grades[0]+grades[1]+grades[2]+grades[3])/4;
		System.out.println("Average grade is "+ average);
		
		//other way to do it 
		
		System.out.println("Creating an array of cities..................");
		String[] cities={"washington DC", "New York", "Paris", "Miami", "Los Angles", "Dallas", "Chantilly"};
System.out.println("I live in "+cities[2]);

//or we can also go by assigning a value to our variable 

int x=1;
System.out.println(cities[x]);

//or 

x+=3;
System.out.println("I moved to "+ cities[x]);

//how many elements stored inside an array
int arraySize=cities.length; // this shows how many elements are included in an array 
System.out.println("Total elements "+arraySize);

//how can we access last element from an array?
System.out.println(cities[arraySize-1]);// because index starts from 0 so we need to use -1 to find the last element of in an array

//how can we access all elements from an array

for(int i=0; i<arraySize; i++) {
	System.out.println(cities[i]);
}
}
}
