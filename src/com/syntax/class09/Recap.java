package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=3; i++ ) {
			for (int j=1; j<=3; j++) {
				System.out.println(i + " " +j);
			}
		}
		
		//using nested loop to print 10 until 99
		
		for(int a=1; a<=9; a++) {
			for(int b=0; b<=9; b++) {
				System.out.println(a + "" +b);
			}
		}
		
		//using nested loop to print clock
		
		for(int h=0; h<24; h++) {
			for(int m=0; m<60; m++) {
				if(m<10) {
					System.out.println(h+":0"+m);
				}else {
				System.out.println(h+":"+m);
			}
		}
		
	}

}
}
