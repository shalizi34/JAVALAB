package com.syntax.class24;

public abstract class File {

	//Create a class File that will have the following behaviors:
	// open, edit, close. Edit and close are implemented method while open is an abstract. 
	//Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide 
	//specific implementation of open behaviour: Example: to open .
	//java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc

	
		public abstract void open();
		public void edit() {
			System.out.println("it will open");
		}
		public void close() {
			System.out.println("it will close");
		}
	}

class JavaFile extends File {
	@Override
	public void open() {
		System.out.println("To open JavaFile you need Eclipse IDE");
	}
}
class WordFile extends File {
	@Override
	public void open() {
		System.out.println("To open WordFile you need MS Office");
	}
}
class PDFFile extends File {
	@Override
	public void open() {
		System.out.println("To open PDFFile you need PDF reader");
	}
}