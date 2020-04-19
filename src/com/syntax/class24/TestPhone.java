package com.syntax.class24;

public class TestPhone {

	public static void main (String[] args) {
		
		//new phone(); CE: cannot instantiate/create an object of phone class becuase it is ABSTRACT
		
		Phone iphone=new iPhone();
		
		iphone.call();
		iphone.text();
		iphone.takePicture();
		iphone.playMusic();
		
		
		 Phone samsung=new Samsung();
		 samsung.call();
		 samsung.text();
		 samsung.takePicture();
		 samsung.playMusic();
		 
	}
}
