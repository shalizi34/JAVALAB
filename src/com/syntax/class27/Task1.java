package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

//Create an arrayList of words. Remove every word that ends with “e”. Use iterator

	public static void main (String[] args) {

ArrayList<String> words=new ArrayList<>();
	words.add("Book");
	words.add("Nice");
	words.add("Slice");
	words.add("Money");
	
	Iterator<String> word=words.iterator();
	while (word.hasNext()) {
		String wordss = word.next();
		if (wordss.endsWith("e")) {
			word.remove();
		}
	}
	System.out.print(words + " ");
}
		
}
