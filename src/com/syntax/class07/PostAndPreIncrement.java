package com.syntax.class07;

public class PostAndPreIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//++,--
		//preincrement ++y, postincrement y++
		
		int z;
		int y=10;
		z=y++;//postincrement = first use the variable and then increment
		System.out.println(z);
		
		int w;
		int x=10;
		w=++x;
		System.out.println(w);
	}

}
